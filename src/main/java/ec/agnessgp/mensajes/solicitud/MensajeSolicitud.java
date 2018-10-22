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
public class MensajeSolicitud {

	private String mensaje;
	private String compraId;
	
	
	public MensajeSolicitud() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MensajeSolicitud(String mensaje, String compraId) {
		super();
		this.mensaje = mensaje;
		this.compraId = compraId;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getCompraId() {
		return compraId;
	}
	public void setCompraId(String compraId) {
		this.compraId = compraId;
	}
	
	
}
