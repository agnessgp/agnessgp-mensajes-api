package ec.agnessgp.mensajes.servicio;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.ClienteRepository;
import ec.agnessgp.mensajes.modelo.Compra;
import ec.agnessgp.mensajes.modelo.Enviado;
import ec.agnessgp.mensajes.modelo.Mensaje;
import ec.agnessgp.mensajes.modelo.Paquete;
import ec.agnessgp.mensajes.modelo.Telefono;
import ec.agnessgp.mensajes.respuesta.rest.WaboxappRespuesta;
import ec.agnessgp.mensajes.solicitud.rest.WaboxappSolicitud;

@Service
public class GestionMensajesService {

	@Autowired
	CompraService compraServicio;

	@Autowired
	MensajeService mensajeServicio;

	@Autowired
	TelefonoService telefonoService;

	@Autowired
	PaqueteServicio paqueteServicio;

	@Autowired
	private EnviadoService enviadoServicio;

	@Autowired
	private WaboxappService waboxappService;

	@Autowired
	ClienteRepository clienteDao;

	private List<Telefono> generarAleatoriosPack(Paquete paquete) {
		List<Telefono> listaNumerosAleatorio = telefonoService.randomTelefono(paquete.getMensajes().intValue());
		return listaNumerosAleatorio;
	}

	private boolean enviarMensajeWaboxapp(String telefono) {
		WaboxappSolicitud waboxappSolicitud = new WaboxappSolicitud();
		WaboxappRespuesta waboxappRespuesta = waboxappService.enviarWaboxappChat(waboxappSolicitud);
		if (waboxappRespuesta != null)
			return true;
		return true;
	}

	private String enviarMensajeWaboxappMasivo(List<Telefono> numerosTelefonoPack) {
		String numerosTelefonoPackEnviados = "";

		for (Telefono telefono : numerosTelefonoPack) {
			if (enviarMensajeWaboxapp(telefono.getNumero())) {
				numerosTelefonoPackEnviados = numerosTelefonoPackEnviados.concat(telefono.getNumero()).concat(";");
				System.out.println(" -> Teléfono: " + telefono.getNumero());
			}
		}
		return numerosTelefonoPackEnviados;
	}

	public Enviado enviarMensajesPaquete(String texto,Long compraId) {
		Optional<Compra> optionalCompra = compraServicio.obtenerCompraPorId(compraId);
		if(optionalCompra.isPresent()) {
			Mensaje mensaje = mensajeServicio.crearMensaje(texto,optionalCompra.get());
			Optional<Paquete> paqueteCompra = paqueteServicio.obtenerPaquete(mensaje.getCompra().getPaquete().getId());
			if(paqueteCompra.isPresent()) {
				List<Telefono> numerosTelefonoPack= generarAleatoriosPack(paqueteCompra.get());
				String mensajes = enviarMensajeWaboxappMasivo(numerosTelefonoPack);
				return enviadoServicio.crearEnviado(new Enviado(mensaje.getTexto(),mensajes,new Date(),mensaje.getCompra()));
			}
		}
		return null;
	}

}
