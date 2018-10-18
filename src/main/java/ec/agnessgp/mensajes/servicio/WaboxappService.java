/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.WaboxappRepository;
import ec.agnessgp.mensajes.modelo.Waboxapp;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 9 oct. 2018 $]</p>
*/
@Service
public class WaboxappService {

	@Autowired 
	WaboxappRepository waboxappDao;
	
	public Waboxapp obtenerWaboxapp(Long pais,String telefono) {
		return waboxappDao.findByTelefono(telefono);
	}
	
	public Waboxapp obtenerWaboxappPredeterminado() {
		return obtenerWaboxapp(new Long(1), "593991363467");
	}
}
