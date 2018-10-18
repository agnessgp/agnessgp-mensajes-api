/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.ClienteRepository;
import ec.agnessgp.mensajes.modelo.Cliente;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 11 oct. 2018 $]</p>
*/
@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteDao;
	
	public Cliente crearCliente(Cliente cliente) {
		System.out.println("cliente"+cliente.getTelefono());
		return clienteDao.save(cliente);
	}
	
	public Cliente obtenerClientePorTelefono(String telefono) {
		return clienteDao.findByTelefono(telefono);
	}
	
	public boolean existeCliente(String telefono) {
		Cliente cliente = clienteDao.findByTelefono(telefono);
		if(cliente!=null) {
			return true;
		}
		return false;
	} 
}
