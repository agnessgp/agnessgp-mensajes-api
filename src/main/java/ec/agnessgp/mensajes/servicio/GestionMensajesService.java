package ec.agnessgp.mensajes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.clases.MensajeTexto;
import ec.agnessgp.mensajes.clases.TelefonoMovistar;
import ec.agnessgp.mensajes.dao.MensajesRepository;
import ec.agnessgp.mensajes.modelo.Mensajes;
import ec.agnessgp.mensajes.modelo.Personas;

@Service
public class GestionMensajesService {

		
	@Autowired
	private MensajesRepository mensajesRepository;
	
	public MensajeTexto obtenerMensajePorCodigo(String codigo) {
		Mensajes mensajes = mensajesRepository.findByCodigo(codigo);
		MensajeTexto mensajeTexto = new MensajeTexto(mensajes.getTitulo(),mensajes.getMensaje());
		return mensajeTexto;
	}
	
	public void enviarMensajeMovistar(MensajeTexto mensajeTexto) {
		TelefonoMovistar operadorMovistar = new TelefonoMovistar();
		operadorMovistar.enviarMensaje(mensajeTexto);
	}
	
}
