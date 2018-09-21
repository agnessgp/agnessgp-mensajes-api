package ec.agnessgp.mensajes.superclase;

import ec.agnessgp.mensajes.interfaz.ILlamada;
import ec.agnessgp.mensajes.interfaz.IMensaje;

public abstract class Telefono implements ILlamada, IMensaje {
	
	private String numero;

	public Telefono(String numero) {
		super();
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}



}
