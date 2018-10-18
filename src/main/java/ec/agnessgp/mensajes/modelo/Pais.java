/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 6 oct. 2018 $]</p>
*/
@JsonSerialize
@Entity
@Table(name="ban_pais_t")	
public class Pais {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String iso2;
	private String iso3;
	private String cia;
	private String telefono;
	private String internet;
	private String vehiculo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codigo_continente")
	private Continente continente;
	

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "pais_id")
	private List<Telefono> listaTelefono;

	
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pais(Long id, String nombre, String iso2, String iso3, String cia, String telefono, String internet,
			String vehiculo, Continente continente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.iso2 = iso2;
		this.iso3 = iso3;
		this.cia = cia;
		this.telefono = telefono;
		this.internet = internet;
		this.vehiculo = vehiculo;
		this.continente = continente;
	}

	

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", iso2=" + iso2 + ", iso3=" + iso3 + ", cia=" + cia
				+ ", telefono=" + telefono + ", internet=" + internet + ", vehiculo=" + vehiculo + ", continente="
				+ continente + "]";
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIso2() {
		return iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getIso3() {
		return iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getInternet() {
		return internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Continente getContinente() {
		return continente;
	}

	public void setContinente(Continente continente) {
		this.continente = continente;
	}
	
	

}
