package ec.agnessgp.mensajes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.MensajesRepository;

@Service
public class GestionMensajesService {

		
	@Autowired
	private MensajesRepository mensajesRepository;
	
	@Autowired
	private WaboxappService waboxappService;
	
	 
}
