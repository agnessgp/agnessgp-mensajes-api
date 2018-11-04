/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.modelo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 29 oct. 2018 $]</p>
*/
@Entity
@Table(name="ban_autorizacion_t")
public class Autorizacion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String telefono;
	private String codigo;
	private Date fecha;
	private String estado;  //SOL- SOLICITADO; AUT-AUTORIZADO, DEN- DENEGADO
	
	public Autorizacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autorizacion(String telefono,String codigo, Date fecha, String estado) {
		this.telefono = telefono;
		this.codigo = codigo;
		this.fecha = fecha;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Autorizacion [id=" + id + ", telefono=" + telefono + ", codigo=" + codigo + ", fecha=" + fecha
				+ ", estado=" + estado + "]";
	}
	
	
}
