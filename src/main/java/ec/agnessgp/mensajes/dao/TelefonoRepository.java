/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.agnessgp.mensajes.modelo.Telefono;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 22 oct. 2018 $]</p>
*/
public interface TelefonoRepository extends JpaRepository<Telefono, Long>{

}
	