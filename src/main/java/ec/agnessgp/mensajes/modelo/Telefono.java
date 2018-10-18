/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Entity
@Table(name="ban_telefono_t")	
public class Telefono {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String numero;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pais_id")
	private Pais pais;
	
	public Telefono() {

	}	
	
	public Telefono(Long id, String numero, Pais pais) {
		super();
		this.id = id;
		this.numero = numero;
		this.pais = pais;
	}



	@Override
	public String toString() {
		return "Telefono [id=" + id + ", numero=" + numero + ", pais=" + pais + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

	
}
