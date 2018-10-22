/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.MensajeRepository;
import ec.agnessgp.mensajes.modelo.Compra;
import ec.agnessgp.mensajes.modelo.Mensaje;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 22 oct. 2018 $]</p>
*/
@Service
public class MensajeService {

	@Autowired
	MensajeRepository mensajeDao;
	
	public Mensaje crearMensaje(String texto,Compra compra) {
		Mensaje mensaje = new Mensaje(texto, new Date(), compra);
		return mensajeDao.save(mensaje);
	}
}
