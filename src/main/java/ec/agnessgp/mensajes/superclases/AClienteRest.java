/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.superclases;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.apache.log4j.Logger;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 19 oct. 2018 $]</p>
*/
public abstract class AClienteRest {

	private static final Logger log = Logger.getLogger(AClienteRest.class.getName());
	
	private String url;
	private String contextPath;
	
	
	public AClienteRest(String url, String contextPath) {
		this.url = url;
		this.contextPath = contextPath;	
	}
	
	
	protected WebTarget crearCliente(String path) {
			String rutaEnsamblada = ensamblarEndPoint(path);
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target(rutaEnsamblada);
			return target;
	}
	
	
	private String ensamblarEndPoint(String path) {
		String endPoint = url.concat(contextPath).concat(path);
		log.info(endPoint);
		return endPoint;
	}
	
}
