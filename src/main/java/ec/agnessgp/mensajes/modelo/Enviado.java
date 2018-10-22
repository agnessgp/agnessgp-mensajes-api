package ec.agnessgp.mensajes.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name="ban_enviados_t")	
public class Enviado {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String mensaje;
	private String numerosTelefonicos;
	private Date fechaRegistro;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="compra_id")
	private Compra compra;
	
		
	public Enviado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enviado(String mensaje, String numerosTelefonicos, Date fechaRegistro, Compra compra) {
		this.mensaje = mensaje;
		this.numerosTelefonicos = numerosTelefonicos;
		this.fechaRegistro = fechaRegistro;
		this.compra = compra;
	}	

	public Enviado(Long id, String mensaje, String numerosTelefonicos, Date fechaRegistro, Compra compra) {
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.numerosTelefonicos = numerosTelefonicos;
		this.fechaRegistro = fechaRegistro;
		this.compra = compra;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public String getNumerosTelefonicos() {
		return numerosTelefonicos;
	}


	public void setNumerosTelefonicos(String numerosTelefonicos) {
		this.numerosTelefonicos = numerosTelefonicos;
	}


	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public Compra getCompra() {
		return compra;
	}


	public void setCompra(Compra compra) {
		this.compra = compra;
	}


	
	
}
