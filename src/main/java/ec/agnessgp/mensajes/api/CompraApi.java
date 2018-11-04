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

import ec.agnessgp.mensajes.modelo.Compra;
import ec.agnessgp.mensajes.respuesta.CompraRespuesta;
import ec.agnessgp.mensajes.servicio.CompraService;
import ec.agnessgp.mensajes.solicitud.CompraSolicitud;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 11 oct. 2018 $]</p>
*/
@RestController
@RequestMapping("/api/compra")
public class CompraApi {

	@Autowired
	Mapper mapper;
	
	@Autowired
	CompraService compraService;
	
	@RequestMapping(value="/crear", method=RequestMethod.POST)
	public CompraRespuesta crearNuevaCompra(@RequestBody CompraSolicitud compraSolicitud) {
		Compra compra = compraService.crearNuevo(compraSolicitud.getTelefono(), compraSolicitud.getIdPaquete(), compraSolicitud.getIdAutorizacion());
		CompraRespuesta compraRespuesta = mapper.map(compra, CompraRespuesta.class);
		return compraRespuesta;
	}
	
	
	
}
