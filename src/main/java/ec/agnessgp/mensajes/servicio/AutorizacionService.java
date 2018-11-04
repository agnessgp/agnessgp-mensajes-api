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
import ec.agnessgp.mensajes.modelo.Autorizacion;
import ec.agnessgp.mensajes.modelo.Llave;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 29 oct. 2018 $]</p>
*/
@Service
public class AutorizacionService {

	@Autowired
	GestionEncriptacionService  gestionEncriptacionServicio;
	
	@Autowired
	LlaveService  llaveService;
	
	@Autowired
	AutorizacionRepository autorizacionDao;
	
	public Autorizacion obtenerAutorizacion(Long id) {
		return autorizacionDao.getOne(id);
	}
	
	public Autorizacion crearAutorizacionAcceso(String tlfAutorizacion) {
		int codigo = (int)(100000 * Math.random());
		System.out.println("Còdigo:"+codigo);
		Llave llave = llaveService.buscarPorCodigo("COD");
		String codigoEncrypt = gestionEncriptacionServicio.encriptarTexto(String.valueOf(codigo), llave);
		Autorizacion autorizacion = new Autorizacion(tlfAutorizacion,codigoEncrypt,new Date(),"SOL");
		return autorizacionDao.saveAndFlush(autorizacion);
	}
	
	/**
	 * <b>
	 * Autoriza acceso mediante el código enviado al teléfono
	 * </b>
	 * <p>[Author: Patricio Pilco, Date: 3 nov. 2018]</p>
	 *
	 * @param id Id de autorizacion generado al solicitar acceso a la aplicación
	 * @param codigo Código de autorización enviado al teléfono
	 * @return Autorizacion de acceso.
	 */ 
	public Autorizacion autorizarAcceso(Long id, String codigo) {
		Optional<Autorizacion> autorizacionOptional = autorizacionDao.findById(id);
		if(autorizacionOptional.isPresent()) {
			Autorizacion autorizacion = autorizacionOptional.get();
			Llave llave = llaveService.buscarPorCodigo("COD");
			String codigoEncrypt = gestionEncriptacionServicio.encriptarTexto(String.valueOf(codigo), llave);
			if(autorizacion.getCodigo().equals(codigoEncrypt)) {
				autorizacion.setEstado("AUT");
				return autorizacionDao.saveAndFlush(autorizacion);
			}
		}
		return null;
	}
	
	
}
