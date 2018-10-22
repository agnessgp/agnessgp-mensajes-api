/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.EnviadoRepository;
import ec.agnessgp.mensajes.modelo.Enviado;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 19 oct. 2018 $]</p>
*/
@Service
public class EnviadoService {

	@Autowired
	EnviadoRepository enviadoDao;
	
	public Enviado crearEnviado(Enviado enviado) {
		return enviadoDao.save(enviado);
	}
}
