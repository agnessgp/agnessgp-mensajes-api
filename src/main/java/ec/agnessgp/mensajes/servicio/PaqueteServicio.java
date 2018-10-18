/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.PaqueteRepository;
import ec.agnessgp.mensajes.modelo.Paquete;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 11 oct. 2018 $]</p>
*/
@Service
public class PaqueteServicio {

	@Autowired
	PaqueteRepository paqueteDao;
	
	public Iterable<Paquete> listarPaqueteTodos() {
		return paqueteDao.findAll();
	}
}
