/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.clienteRest;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ec.agnessgp.mensajes.respuesta.rest.WaboxappRespuesta;
import ec.agnessgp.mensajes.solicitud.rest.WaboxappSolicitud;
import ec.agnessgp.mensajes.superclases.AClienteRest;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 19 oct. 2018 $]</p>
*/
public class WaboxappClienteRest extends AClienteRest{

	/**
	* @param url
	* @param contextPath
	*/ 
	public WaboxappClienteRest(String url, String contextPath) {
		super(url, contextPath);
		// TODO Auto-generated constructor stub
	}
	
	public WaboxappRespuesta getWaboxappEnviarChat(WaboxappSolicitud waboxappSolicitud) {
		WebTarget cliente = crearCliente("/send/chat");
		Response response = cliente.request(MediaType.APPLICATION_JSON).post(Entity.json(waboxappSolicitud));
		WaboxappRespuesta waboxappRespuesta = response.readEntity(WaboxappRespuesta.class);
		return waboxappRespuesta;
	}
}
