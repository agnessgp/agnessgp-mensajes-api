/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.api;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec.agnessgp.mensajes.modelo.Enviado;
import ec.agnessgp.mensajes.respuesta.MensajeRespuesta;
import ec.agnessgp.mensajes.servicio.GestionMensajesService;
import ec.agnessgp.mensajes.solicitud.MensajeSolicitud;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 22 sep. 2018 $]</p>
*/
@RestController
public class MensajesTelefonoApi {

	@Autowired
	Mapper mapper;
	
	@Autowired
	private GestionMensajesService gestionMensajesService;
	
	@RequestMapping(value="/api/mensajes/enviarPaquete", method=RequestMethod.POST)
	public MensajeRespuesta enviarPaqueteMensajes(@RequestBody MensajeSolicitud mensajeSolicitud) { 
		Enviado enviado = gestionMensajesService.enviarMensajesPaquete(mensajeSolicitud.getMensaje(),new Long(mensajeSolicitud.getCompraId()));
		MensajeRespuesta mensajeRespuesta = mapper.map(enviado, MensajeRespuesta.class);
		return mensajeRespuesta;
	}
}
