/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.solicitud.rest;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 19 oct. 2018 $]</p>
*/
public class WaboxappSolicitud {
	private String token;
	private String uid;
	private String to;
	private String custom_uid;
	private String text;
	
	
	public WaboxappSolicitud() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WaboxappSolicitud(String token, String uid, String to, String custom_uid, String text) {
		super();
		this.token = token;
		this.uid = uid;
		this.to = to;
		this.custom_uid = custom_uid;
		this.text = text;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getCustom_uid() {
		return custom_uid;
	}
	public void setCustom_uid(String custom_uid) {
		this.custom_uid = custom_uid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
