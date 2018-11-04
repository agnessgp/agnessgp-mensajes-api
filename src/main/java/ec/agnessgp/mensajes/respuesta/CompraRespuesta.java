/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.respuesta;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 31 oct. 2018 $]</p>
*/
public class CompraRespuesta {

	private String id;
	private String estado;
	private String fechaRegistro;
	
	public CompraRespuesta() {

	}

	public CompraRespuesta(String id, String estado, String fechaRegistro) {
		super();
		this.id = id;
		this.estado = estado;
		this.fechaRegistro = fechaRegistro;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	
}
