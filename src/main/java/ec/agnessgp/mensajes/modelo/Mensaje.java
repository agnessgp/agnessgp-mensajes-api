package ec.agnessgp.mensajes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@Entity
@Table(name="ban_mensaje_t")	
public class Mensaje {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String codigoUnico;
	private String titulo;
	private String mensaje;
	private String telefonoOrigen;
	private String telefonoDestino;
	
		
	public Mensaje() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Mensaje(Long id, String codigoUnico, String titulo, String mensaje, String telefonoOrigen,
			String telefonoDestino) {
		super();
		this.id = id;
		this.codigoUnico = codigoUnico;
		this.titulo = titulo;
		this.mensaje = mensaje;
		this.telefonoOrigen = telefonoOrigen;
		this.telefonoDestino = telefonoDestino;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigoUnico() {
		return codigoUnico;
	}


	public void setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public String getTelefonoOrigen() {
		return telefonoOrigen;
	}


	public void setTelefonoOrigen(String telefonoOrigen) {
		this.telefonoOrigen = telefonoOrigen;
	}


	public String getTelefonoDestino() {
		return telefonoDestino;
	}


	public void setTelefonoDestino(String telefonoDestino) {
		this.telefonoDestino = telefonoDestino;
	}
	
	

	
	
}
