/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 11 oct. 2018 $]</p>
*/
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="ban_compra_t")
public class Compra implements Serializable{

	/**
	* 
	*/ 
	private static final long serialVersionUID = 2562305849641501020L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String estado;
	private Date fechaRegistro;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Paquete paquete;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "compra_id")
	private List<Enviado> listaEnviados;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Autorizacion autorizacion;
	
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compra(String estado, Cliente cliente, Paquete paquete) {
		this.estado = estado;
		this.cliente = cliente;
		this.paquete = paquete;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public List<Enviado> getListaEnviados() {
		return listaEnviados;
	}

	public void setListaEnviados(List<Enviado> listaEnviados) {
		this.listaEnviados = listaEnviados;
	}

	public Autorizacion getAutorizacion() {
		return autorizacion;
	}

	public void setAutorizacion(Autorizacion autorizacion) {
		this.autorizacion = autorizacion;
	}

}
