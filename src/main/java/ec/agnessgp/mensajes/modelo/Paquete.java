/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 11 oct. 2018 $]</p>
*/
@Entity
@Table(name="ban_paquete_t")

public class Paquete implements Serializable{

	/**
	* 
	*/ 
	private static final long serialVersionUID = -8598426348199486683L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long mensajes;	
	private Long precio;
	

	@JsonBackReference
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "paquete_id")
	private List<Compra> listaCompra = new ArrayList<>();
	
	public Paquete() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Paquete(Long id, Long mensajes, Long precio) {
		super();
		this.id = id;
		this.mensajes = mensajes;
		this.precio = precio;
	}

	public Paquete(Long mensajes, Long precio) {
		this.mensajes = mensajes;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Paquete [id=" + id + ", mensajes=" + mensajes + ", precio=" + precio + "]";
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


	public List<Compra> getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(List<Compra> listaCompra) {
		this.listaCompra = listaCompra;
	}
	


}
