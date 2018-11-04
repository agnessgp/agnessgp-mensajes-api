package ec.agnessgp.mensajes.servicio;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.modelo.Compra;
import ec.agnessgp.mensajes.modelo.Enviado;
import ec.agnessgp.mensajes.modelo.InformacionMensaje;
import ec.agnessgp.mensajes.modelo.Paquete;
import ec.agnessgp.mensajes.modelo.Telefono;

@Service
public class GestionMensajesService {

	@Autowired
	CompraService compraServicio;

	@Autowired
	TelefonoService telefonoService;

	@Autowired
	PaqueteServicio paqueteServicio;

	@Autowired
	private EnviadoService enviadoServicio;

	@Autowired
	private WaboxappService waboxappService;
	
	@Autowired
	InformacionMensajeService informacionMensajeService;
	
	
	private List<Telefono> generarAleatoriosPack(Paquete paquete) {
		List<Telefono> listaNumerosAleatorio = telefonoService.randomTelefono(paquete.getMensajes().intValue());
		return listaNumerosAleatorio;
	}


	private String enviarMensajeWaboxappMasivoTexto(List<Telefono> numerosTelefonoPack ,String texto, String codigo) {
		String numerosTelefonoPackEnviados = "";

		for (Telefono telefono : numerosTelefonoPack) {
				waboxappService.enviarWaboxappTexto(telefono.getNumero(),texto,codigo.concat("-").concat(telefono.getNumero()));
				numerosTelefonoPackEnviados = numerosTelefonoPackEnviados.concat(telefono.getNumero()).concat(";");
				System.out.println(" -> Teléfono: " + telefono.getNumero());
		}
		return numerosTelefonoPackEnviados;
	}
	

	public Enviado enviarMensajesPaqueteTexto(String texto,Long idCompra) {
		Optional<Compra> optionalCompra = compraServicio.obtenerCompraPorId(idCompra);
		if(optionalCompra.isPresent()) {
			InformacionMensaje mensaje = informacionMensajeService.crearInformacionMensajeTexto(texto, idCompra);
			Optional<Paquete> paqueteCompra = paqueteServicio.obtenerPaquete(mensaje.getCompra().getPaquete().getId());
			if(paqueteCompra.isPresent()) {
				List<Telefono> numerosTelefonoPack= generarAleatoriosPack(paqueteCompra.get());
				String mensajes = enviarMensajeWaboxappMasivoTexto(numerosTelefonoPack,texto,optionalCompra.get().getAutorizacion().getCodigo());
				return enviadoServicio.crearEnviado(new Enviado(mensaje.getTexto(),mensajes,new Date(),mensaje.getCompra()));
			}
		}
		return null;
	}
	


}
