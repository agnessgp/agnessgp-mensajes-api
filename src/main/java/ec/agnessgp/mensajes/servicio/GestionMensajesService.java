package ec.agnessgp.mensajes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.clase.MensajeTexto;
import ec.agnessgp.mensajes.clase.OperadorMovistar;
import ec.agnessgp.mensajes.dao.MensajesRepository;
import ec.agnessgp.mensajes.modelo.Mensajes;
import ec.agnessgp.mensajes.modelo.Personas;

@Service
public class GestionMensajesService {

		
	@Autowired
	private MensajesRepository mensajesRepository;
	
	
	public void enviarMensajeTextoMovistar(Personas persona) {
		Mensajes mensajes = mensajesRepository.findByCodigo("CODACC");
		MensajeTexto mensajeTexto = new MensajeTexto(mensajes.getTitulo(),mensajes.getMensaje());
		OperadorMovistar operadorMovistar = new OperadorMovistar(persona.getMediosContacto().getCelular());
		operadorMovistar.enviarMensaje(mensajeTexto);
	}
	
}
