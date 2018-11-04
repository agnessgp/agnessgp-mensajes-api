/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.modelo.Autorizacion;
import ec.agnessgp.mensajes.respuesta.rest.WaboxappRespuesta;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 29 oct. 2018 $]</p>
*/
@Service
public class GestionAutorizacionService {

	@Autowired
	AutorizacionService autorizacionServicio;
	
	@Autowired
	private WaboxappService waboxappService;
	
	public WaboxappRespuesta enviarMensajeAutorizacion(String texto,Long idAutorizacion) {
		Autorizacion autorizacion = autorizacionServicio.obtenerAutorizacion(idAutorizacion);
		WaboxappRespuesta waboxappRespuesta = waboxappService.enviarWaboxappTexto(autorizacion.getTelefono(),texto.concat(autorizacion.getCodigo()),autorizacion.getCodigo());
		return waboxappRespuesta;
	}
	
}
