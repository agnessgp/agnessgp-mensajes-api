package ec.agnessgp.mensajes.interfaz;

import ec.agnessgp.mensajes.clases.MensajeTexto;

public interface IMensaje {

	void enviarMensaje(String mensaje);
	void enviarMensaje(MensajeTexto mensajeTexto);

	void recibirMensaje();

}
