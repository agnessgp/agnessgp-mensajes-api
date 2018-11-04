/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.AutorizacionRepository;
import ec.agnessgp.mensajes.dao.ClienteRepository;
import ec.agnessgp.mensajes.dao.CompraRepository;
import ec.agnessgp.mensajes.dao.PaqueteRepository;
import ec.agnessgp.mensajes.modelo.Autorizacion;
import ec.agnessgp.mensajes.modelo.Cliente;
import ec.agnessgp.mensajes.modelo.Compra;
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
public class CompraService {

	@Autowired
	CompraRepository compraDao;
	
	@Autowired
	ClienteRepository clienteDao;
	
	@Autowired
	PaqueteRepository paqueteDao;
	
	@Autowired
	AutorizacionRepository autorizacionDao;
	
	public Compra crearNuevo(Cliente cliente,Paquete paquete,Autorizacion autorizacion) {
		Compra compra =new Compra();
		compra.setFechaRegistro(new Date());
		compra.setCliente(cliente);
		compra.setPaquete(paquete);
		compra.setAutorizacion(autorizacion);
		compra.setEstado("SOL");
		return compraDao.save(compra);
	}
	
	public Compra crearNuevo(String telefono,Long idPaquete, Long idAutorizacion) {
		Cliente cliente = clienteDao.findByTelefono(telefono);
		Optional<Paquete> paqueteOptional = paqueteDao.findById(idPaquete);
		Optional<Autorizacion> autorizacionOptional = autorizacionDao.findById(idAutorizacion);
		if(paqueteOptional.isPresent() && autorizacionOptional.isPresent()) {
			Paquete paquete = paqueteOptional.get();
			Autorizacion autorizacion = autorizacionOptional.get();
			return crearNuevo(cliente, paquete,autorizacion);
		}
		return null;
	}
	
	public Optional<Compra> obtenerCompraPorId(Long id) {
		return compraDao.findById(id);
	}
	
}
