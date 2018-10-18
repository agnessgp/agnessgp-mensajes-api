/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec.agnessgp.mensajes.modelo.Compra;
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
public class CompraApi {

	@Autowired
	CompraService compraService;
	
	@RequestMapping(value="/api/compra/crear", method=RequestMethod.POST)
	public Compra crearNuevaCompra(@RequestBody CompraSolicitud compraSolicitud) {
		return compraService.crearNuevo(compraSolicitud.getTelefono(), compraSolicitud.getPaqueteId());
	}
	
	
	
}
