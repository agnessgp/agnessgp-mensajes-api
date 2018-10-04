/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ec.agnessgp.mensajes.servicio.GestionMensajesService;

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
	private GestionMensajesService gestionMensajesService;
	
	
}
