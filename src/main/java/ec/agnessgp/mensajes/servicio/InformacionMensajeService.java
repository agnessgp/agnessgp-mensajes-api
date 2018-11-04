/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.InformacionMensajeRepository;
import ec.agnessgp.mensajes.modelo.Compra;
import ec.agnessgp.mensajes.modelo.InformacionMensaje;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 29 oct. 2018 $]</p>
*/
@Service
public class InformacionMensajeService {

	@Autowired
	InformacionMensajeRepository informacionMensajeDao;
	
	@Autowired
	CompraService compraServicio;
	
	public InformacionMensaje crearInformacionMensajeTexto(String texto, Long idCompra) {
		Optional<Compra> compraOptional = compraServicio.obtenerCompraPorId(idCompra);
		if(compraOptional.isPresent()) {
			Compra compra = compraOptional.get();
			InformacionMensaje informacionMensaje = new InformacionMensaje("TXT", texto, new Date(), compra);
			return informacionMensajeDao.save(informacionMensaje);
		}
		return null;
	}
	
	public InformacionMensaje crearInformacionMensajeImagen(String imagen,String path, Long idCompra) {
		Optional<Compra> compraOptional = compraServicio.obtenerCompraPorId(idCompra);
		if(compraOptional.isPresent()) {
			Compra compra = compraOptional.get();
			InformacionMensaje informacionMensaje = new InformacionMensaje("IMG",imagen,path,new Date(),compra);
			return informacionMensajeDao.save(informacionMensaje);
		}
		return null;
	}
}
