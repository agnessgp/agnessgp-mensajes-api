package ec.agnessgp.mensajes.interfaz;

import ec.agnessgp.mensajes.clase.MensajeTexto;

public interface IMensaje {

	void enviarMensaje(MensajeTexto mensajeTexto);

	void recibirMensaje();

}
