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
	private Long paqueteId;
	
	public CompraSolicitud(String telefono, Long paqueteId) {
		this.telefono = telefono;
		this.paqueteId = paqueteId;
	}
	public CompraSolicitud() {
		// TODO Auto-generated constructor stub
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Long getPaqueteId() {
		return paqueteId;
	}
	public void setPaqueteId(Long paqueteId) {
		this.paqueteId = paqueteId;
	}
	
	
}
