/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.respuesta.rest;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 19 oct. 2018 $]</p>
*/
public class WaboxappRespuesta {

	private String success;
	private String custom_uid;
	private String error;
	
	public WaboxappRespuesta() {
		
	}
	
	public WaboxappRespuesta(String success, String custom_uid, String error) {
		super();
		this.success = success;
		this.custom_uid = custom_uid;
		this.error = error;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getCustom_uid() {
		return custom_uid;
	}

	public void setCustom_uid(String custom_uid) {
		this.custom_uid = custom_uid;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
	
}
