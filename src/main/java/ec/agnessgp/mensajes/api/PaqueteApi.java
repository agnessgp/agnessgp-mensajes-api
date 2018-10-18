/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */
package ec.agnessgp.mensajes.api;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec.agnessgp.mensajes.dao.PaqueteRepository;
import ec.agnessgp.mensajes.modelo.Paquete;
import ec.agnessgp.mensajes.respuesta.PaqueteResponse;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Patricio Pilco
 * @version $Revision: 1.0 $
 *          <p>
 * 			[$Author: Patricio Pilco $, $Date: 11 oct. 2018 $]
 *          </p>
 */
@RestController
public class PaqueteApi {

	@Autowired
	Mapper mapper;

	@Autowired
	PaqueteRepository paqueteDao;

	@RequestMapping(value = "/api/paquete/todos", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<PaqueteResponse> listarTodos() {
		Iterable<Paquete> listaPaquete = paqueteDao.findAll();
		List<PaqueteResponse> listaPaqueteResponse = new ArrayList<PaqueteResponse>();
		for (Paquete paquete : listaPaquete) {
			PaqueteResponse paqueteResponse = mapper.map(paquete, PaqueteResponse.class);
			listaPaqueteResponse.add(paqueteResponse);
		}
		return listaPaqueteResponse;
	}

}
