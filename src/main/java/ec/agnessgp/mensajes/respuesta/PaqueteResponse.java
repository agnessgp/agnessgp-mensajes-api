/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.respuesta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 15 oct. 2018 $]</p>
*/

public class PaqueteResponse {

	private Long id;
	private Long mensajes;	
	private Long precio;
	
	public PaqueteResponse() {
		super();	
		// TODO Auto-generated constructor stub
	}
	public PaqueteResponse(Long id, Long mensajes, Long precio) {
		super();
		this.id = id;
		this.mensajes = mensajes;
		this.precio = precio;
	}
	
	
	
	@Override
	public String toString() {
		return "PaqueteResponse [id=" + id + ", mensajes=" + mensajes + ", precio=" + precio + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMensajes() {
		return mensajes;
	}
	public void setMensajes(Long mensajes) {
		this.mensajes = mensajes;
	}
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	

}
