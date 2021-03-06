/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 22 oct. 2018 $]</p>
*/
@Entity
@Table(name="ban_mensajes_t")	
public class InformacionMensaje {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String tipoInformacion;
	private String texto;
	private String imagen;
	private String pathImagen;
	private Date fechaCreacion;
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Compra compra;
	
	public InformacionMensaje(String tipoInformacion,String texto, Date fechaCreacion, Compra compra) {
		this.tipoInformacion = tipoInformacion;
		this.texto = texto;
		this.fechaCreacion = fechaCreacion;
		this.compra = compra;
	}
	
	
	
	public InformacionMensaje(String tipoInformacion,String imagen, String pathImagen, Date fechaCreacion, Compra compra) {
		this.tipoInformacion = tipoInformacion;
		this.imagen = imagen;
		this.pathImagen = pathImagen;
		this.fechaCreacion = fechaCreacion;
		this.compra = compra;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getPathImagen() {
		return pathImagen;
	}

	public void setPathImagen(String pathImagen) {
		this.pathImagen = pathImagen;
	}

	public String getTipoInformacion() {
		return tipoInformacion;
	}

	public void setTipoInformacion(String tipoInformacion) {
		this.tipoInformacion = tipoInformacion;
	}
	
}
