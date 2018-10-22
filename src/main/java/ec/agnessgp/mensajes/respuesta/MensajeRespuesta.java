/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.respuesta;

import java.util.Date;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 22 oct. 2018 $]</p>
*/
public class MensajeRespuesta {

	private Long id;
	private String mensaje;
	private String numerosTelefonicos;
	private Date fechaRegistro;
	
	public MensajeRespuesta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MensajeRespuesta(Long id, String mensaje, String numerosTelefonicos, Date fechaRegistro) {
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.numerosTelefonicos = numerosTelefonicos;
		this.fechaRegistro = fechaRegistro;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getNumerosTelefonicos() {
		return numerosTelefonicos;
	}
	public void setNumerosTelefonicos(String numerosTelefonicos) {
		this.numerosTelefonicos = numerosTelefonicos;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
}
