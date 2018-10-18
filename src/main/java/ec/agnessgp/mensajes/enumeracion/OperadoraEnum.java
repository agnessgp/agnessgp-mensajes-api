/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.enumeracion;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 22 sep. 2018 $]</p>
*/
public enum OperadoraEnum {
	DESCONOCIDO(0,"Desconocido"),
	MOVISTAR(1,"Movistar"),
	CLARO(2,"Claro"),
	CNT(3,"Cnt");
	
	private int id;
	private String nombre;
	
	private OperadoraEnum(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
