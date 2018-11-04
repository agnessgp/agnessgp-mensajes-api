/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.clienteRest.WaboxappClienteRest;
import ec.agnessgp.mensajes.dao.WaboxappRepository;
import ec.agnessgp.mensajes.modelo.Waboxapp;
import ec.agnessgp.mensajes.respuesta.rest.WaboxappRespuesta;
import ec.agnessgp.mensajes.solicitud.rest.WaboxappSolicitud;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 9 oct. 2018 $]</p>
*/
@Service
public class WaboxappService {

	@Autowired 
	WaboxappRepository waboxappDao;
	
	public Waboxapp obtenerWaboxappTelefono(Long pais,String telefono) {
		return waboxappDao.findByTelefono(telefono);
	}
	
	public Waboxapp obtenerWaboxappPredeterminado() {
		return obtenerWaboxappTelefono(new Long(1), "593991363467");
	}
	
	public WaboxappRespuesta enviarWaboxappTexto(String tlfDestino, String texto, String idUnico) {
		Waboxapp waboxapp = obtenerWaboxappPredeterminado();
		WaboxappSolicitud waboxappSolicitud = new WaboxappSolicitud(waboxapp.getApi_token(), waboxapp.getTelefono(), tlfDestino, idUnico, texto);
		WaboxappClienteRest clienteRest = new WaboxappClienteRest(waboxapp.getUrl(), waboxapp.getContexto());
		WaboxappRespuesta respuesta = clienteRest.getWaboxappEnviarChat(waboxappSolicitud);
		return respuesta;
	}
	
}
