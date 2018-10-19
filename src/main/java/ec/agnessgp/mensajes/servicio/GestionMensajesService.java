package ec.agnessgp.mensajes.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.MensajesRepository;
import ec.agnessgp.mensajes.modelo.Paquete;
import ec.agnessgp.mensajes.modelo.Waboxapp;
import ec.agnessgp.mensajes.respuesta.rest.WaboxappRespuesta;

@Service
public class GestionMensajesService {

	@Autowired
	PaqueteServicio paqueteServicio;
		
	@Autowired
	private MensajesRepository mensajesRepository;
	
	@Autowired
	private WaboxappService waboxappService;
	
	public boolean enviarMensajeWaboxapp() {
		return true;
	}
	
	public boolean enviarPaqueteMensajes(Long paqueteId) {
		Optional<Paquete> paqueteCompra = paqueteServicio.obtenerPaquete(paqueteId);
		if(paqueteCompra.isPresent()) {
			Paquete paquete = paqueteCompra.get();

			for (int i = 0; i < paquete.getMensajes(); i++) {
				
			}
			
		}
	
		return true;
	}
	
}
