/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.dao;

import org.springframework.data.repository.CrudRepository;

import ec.agnessgp.mensajes.modelo.Persona;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 10 oct. 2018 $]</p>
*/
public interface PersonaRepository extends CrudRepository<Persona, Long>{
	Persona findByIdentificacion(String identificacion);
	
}
