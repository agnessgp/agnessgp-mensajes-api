/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.dao.TelefonoRepository;
import ec.agnessgp.mensajes.modelo.Telefono;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 22 oct. 2018 $]</p>
*/
@Service
public class TelefonoService {
	@Autowired
	TelefonoRepository telefonoDao;
	
	public Telefono randomTelefono() {
		Long numeroRegistros = telefonoDao.count();
		int pagina = (int)(Math.random() * numeroRegistros);
		Page<Telefono> telefonoPage = telefonoDao.findAll(PageRequest.of(pagina, 1));
		
		Telefono telefono = null;
		if(telefonoPage.hasContent()) {
			telefono = telefonoPage.getContent().get(0);
		}
		return telefono;
	}
	
	public List<Telefono> randomTelefono(int tamanio) {
		Long numeroRegistros = telefonoDao.count();
		int pagina = (int)(Math.random() * numeroRegistros);
		Page<Telefono> telefonoPage = telefonoDao.findAll(PageRequest.of(pagina, tamanio));
		
		List<Telefono> listaTelefonos = null;
		if(telefonoPage.hasContent()) {
			listaTelefonos = telefonoPage.getContent();
		}
		return listaTelefonos;
	}
	
}
