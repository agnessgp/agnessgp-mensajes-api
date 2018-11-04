/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.dao;

import org.springframework.data.repository.CrudRepository;

import ec.agnessgp.mensajes.modelo.InformacionMensaje;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 22 oct. 2018 $]</p>
*/
public interface InformacionMensajeRepository extends CrudRepository<InformacionMensaje, Long>{

}
