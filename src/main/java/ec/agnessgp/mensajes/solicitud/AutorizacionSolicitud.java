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
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 22 oct. 2018 $]</p>
*/
public class AutorizacionSolicitud {

	private String texto;
	private Long idAutorizacion;
	private String codigo;
	
	public AutorizacionSolicitud() {
		// TODO Auto-generated constructor stub
	}
	
	public AutorizacionSolicitud(String texto, Long idAutorizacion) {
		this.texto = texto;
		this.idAutorizacion = idAutorizacion;
	}
	
	public AutorizacionSolicitud(String texto, Long idAutorizacion, String codigo) {
		super();
		this.texto = texto;
		this.idAutorizacion = idAutorizacion;
		this.codigo = codigo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Long getIdAutorizacion() {
		return idAutorizacion;
	}

	public void setIdAutorizacion(Long idAutorizacion) {
		this.idAutorizacion = idAutorizacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
