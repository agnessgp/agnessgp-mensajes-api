/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.interfaz;

import java.util.List;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 31 oct. 2018 $]</p>
*/
public interface IOperacionesService<T> {

	public T crear(T tabla);
	public T actualizar(T tabla);
	public boolean eliminar(T tabla);
	public boolean eliminarPorId(Long id);
	public T buscarPorId(Long id);
	public List<T> listarTodos();
}
