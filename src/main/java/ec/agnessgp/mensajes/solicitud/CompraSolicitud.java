/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.solicitud;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 11 oct. 2018 $]</p>
*/
public class CompraSolicitud {

	private String telefono;
	private Long idPaquete;
	private Long idAutorizacion;
	
	public CompraSolicitud() {
	}
	
	public CompraSolicitud(String telefono, Long idPaquete, Long idAutorizacion) {
		super();
		this.telefono = telefono;
		this.idPaquete = idPaquete;
		this.idAutorizacion = idAutorizacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Long getIdPaquete() {
		return idPaquete;
	}

	public void setIdPaquete(Long idPaquete) {
		this.idPaquete = idPaquete;
	}

	public Long getIdAutorizacion() {
		return idAutorizacion;
	}

	public void setIdAutorizacion(Long idAutorizacion) {
		this.idAutorizacion = idAutorizacion;
	}

	

	
	
}
