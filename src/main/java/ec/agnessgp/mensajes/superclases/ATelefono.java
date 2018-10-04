package ec.agnessgp.mensajes.superclases;

import ec.agnessgp.mensajes.enumeracion.OperadoraEnum;
import ec.agnessgp.mensajes.interfaz.ILlamada;
import ec.agnessgp.mensajes.interfaz.IMensaje;

public abstract class ATelefono implements ILlamada, IMensaje {
	private OperadoraEnum operadora;
	private String numero;
	private String imai;
	
	
	public OperadoraEnum getOperadora() {
		return operadora;
	}
	public void setOperadora(OperadoraEnum operadora) {
		this.operadora = operadora;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getImai() {
		return imai;
	}
	
	public void setImai(String imai) {
		this.imai = imai;
	}
	
	
	
}
