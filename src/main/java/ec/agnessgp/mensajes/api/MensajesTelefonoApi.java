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
import ec.agnessgp.mensajes.respuesta.WaboxappTextoRespuesta;
import ec.agnessgp.mensajes.respuesta.MensajeRespuesta;
import ec.agnessgp.mensajes.respuesta.rest.WaboxappRespuesta;
import ec.agnessgp.mensajes.servicio.GestionAutorizacionService;
import ec.agnessgp.mensajes.servicio.GestionMensajesService;
import ec.agnessgp.mensajes.solicitud.AutorizacionSolicitud;
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
	GestionMensajesService gestionMensajesService;
	
	@Autowired
	GestionAutorizacionService gestionAutorizacionService;
	
	/**
	 * <b>
	 * Enviar un conjunto de mensajes previo a una compra realizada.
	 * </b>
	 * <p>[Author: Patricio Pilco, Date: 3 nov. 2018]</p>
	 *
	 * @param mensajeSolicitud; contiene el MENSAJE y el ID de la compra.
	 * @return retorna el MENSAJE, NUMEROS TELEFONICOS, y la FECHA DE REGISTRO
	 */ 
	@RequestMapping(value="/api/mensajes/enviarPaquete", method=RequestMethod.POST)
	public MensajeRespuesta enviarPaqueteMensajes(@RequestBody MensajeSolicitud mensajeSolicitud) { 
		Enviado enviado = gestionMensajesService.enviarMensajesPaqueteTexto(mensajeSolicitud.getMensaje(),new Long(mensajeSolicitud.getCompraId()));
		MensajeRespuesta mensajeRespuesta = mapper.map(enviado, MensajeRespuesta.class);
		return mensajeRespuesta;
	}
	
	/**
	 * <b>
	 * Envia mensaje con el cógigo de autorización 
	 * </b>
	 * <p>[Author: Patricio Pilco, Date: 3 nov. 2018]</p>
	 *
	 * @param autorizacionSolicitud, contienen el NUMERO de telefono con el que se requerie el acceso.
	 * @return Contiene el ESTADO y el ID en el caso de ser exitoso, en el caso de ser fallido envia ERROR.
	 */ 
	@RequestMapping(value="/api/mensajes/autorizacion", method=RequestMethod.POST)
	public WaboxappTextoRespuesta enviarMensajeAutorizacion(@RequestBody AutorizacionSolicitud autorizacionSolicitud) { 
		WaboxappRespuesta waboxappRespuesta = gestionAutorizacionService.enviarMensajeAutorizacion(autorizacionSolicitud.getTexto(), autorizacionSolicitud.getIdAutorizacion());
		WaboxappTextoRespuesta autorizacionRespuesta = mapper.map(waboxappRespuesta, WaboxappTextoRespuesta.class);
		return autorizacionRespuesta;
	}
	
}
	