/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.api;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec.agnessgp.mensajes.modelo.Autorizacion;
import ec.agnessgp.mensajes.respuesta.AutorizacionRespuesta;
import ec.agnessgp.mensajes.servicio.AutorizacionService;
import ec.agnessgp.mensajes.solicitud.AutorizacionSolicitud;
import ec.agnessgp.mensajes.solicitud.TelefonoSolicitud;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 30 oct. 2018 $]</p>
*/
@RestController
@RequestMapping("/api/autorizacion")
public class AutorizacionApi {

	@Autowired
	Mapper mapper;
	
	@Autowired
	AutorizacionService autorizacionService;
	
	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	public AutorizacionRespuesta crearAutorizacionAccesso(@RequestBody TelefonoSolicitud telefonoSolicitud ) {
		Autorizacion autorizacion = autorizacionService.crearAutorizacionAcceso(telefonoSolicitud.getNumero());
		AutorizacionRespuesta autorizacionRespuesta = mapper.map(autorizacion, AutorizacionRespuesta.class);
		return autorizacionRespuesta;
	}
	

	@RequestMapping(value = "/autorizar/{id}", method = RequestMethod.PUT)
	public AutorizacionRespuesta actualizarAutorizacionAcceso(@PathVariable Long id, @RequestBody AutorizacionSolicitud autorizacionSolicitud) {
		Autorizacion autorizacion = autorizacionService.autorizarAcceso(id,autorizacionSolicitud.getCodigo());
		AutorizacionRespuesta autorizacionRespuesta = mapper.map(autorizacion, AutorizacionRespuesta.class);
		return autorizacionRespuesta;
	}
	
	
}
