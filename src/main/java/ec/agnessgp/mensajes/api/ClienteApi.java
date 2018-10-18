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

import ec.agnessgp.mensajes.modelo.Cliente;
import ec.agnessgp.mensajes.servicio.ClienteService;
import ec.agnessgp.mensajes.solicitud.ClienteSolicitud;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 11 oct. 2018 $]</p>
*/
@RestController
public class ClienteApi {

	@Autowired
	ClienteService clienteServicio;
	
	@RequestMapping(value="/api/cliente/crear", method=RequestMethod.POST)
	public Cliente crearNuevoCliente(@RequestBody ClienteSolicitud clienteSolicitud) {
		if(!clienteServicio.existeCliente(clienteSolicitud.getTelefono())) {
			Cliente cliente = new Cliente(clienteSolicitud.getNombres(),clienteSolicitud.getTelefono(),clienteSolicitud.getCorreo());
			return clienteServicio.crearCliente(cliente);
		}
		return null;
	}
	
}
