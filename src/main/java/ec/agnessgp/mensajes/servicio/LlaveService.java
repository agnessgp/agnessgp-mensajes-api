/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.LlaveRespository;
import ec.agnessgp.mensajes.interfaz.IOperacionesService;
import ec.agnessgp.mensajes.modelo.Llave;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 31 oct. 2018 $]</p>
*/
@Service
public class LlaveService implements IOperacionesService<Llave>{

	@Autowired
	LlaveRespository llaveDao;
	
	/* (non-Javadoc)
	* @see ec.agnessgp.mensajes.interfaz.IOperacionesService#crear(java.lang.Object)
	*/ 
	@Override
	public Llave crear(Llave tabla) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	* @see ec.agnessgp.mensajes.interfaz.IOperacionesService#actualizar(java.lang.Object)
	*/ 
	@Override
	public Llave actualizar(Llave tabla) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	* @see ec.agnessgp.mensajes.interfaz.IOperacionesService#eliminar(java.lang.Object)
	*/ 
	@Override
	public boolean eliminar(Llave tabla) {
		Optional<Llave> llaveOptional = llaveDao.findById(tabla.getId());
		 if(llaveOptional.isPresent()) {
			 llaveDao.delete(tabla);
			 return true;
		 }
		return false;
	}

	/* (non-Javadoc)
	* @see ec.agnessgp.mensajes.interfaz.IOperacionesService#eliminarPorId(java.lang.Long)
	*/ 
	@Override
	public boolean eliminarPorId(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	* @see ec.agnessgp.mensajes.interfaz.IOperacionesService#buscarPorId(java.lang.Long)
	*/ 
	@Override
	public Llave buscarPorId(Long id) {
		 Optional<Llave> llaveOptional = llaveDao.findById(id);
		 if(llaveOptional.isPresent()) {
			 return llaveOptional.get();
		 }
		return null;
	}

	/* (non-Javadoc)
	* @see ec.agnessgp.mensajes.interfaz.IOperacionesService#listarTodos()
	*/ 
	@Override
	public List<Llave> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Llave buscarPorCodigo(String codigo) {
		return llaveDao.findByCodigo(codigo);
	}


}
