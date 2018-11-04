/*
 * Copyright 2018 AGNESSGP - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.agnessgp.mensajes.servicio;

import org.springframework.stereotype.Service;

import ec.agnessgp.mensajes.modelo.Llave;
import ec.agnessgp.mensajes.util.StringEncrypt;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author Patricio Pilco
 * @version $Revision: 1.0 $ <p>[$Author: Patricio Pilco $, $Date: 31 oct. 2018 $]</p>
*/
@Service
public class GestionEncriptacionService {

	public String encriptarTexto(String texto, Llave llave) {
		try {
			String telefonoEncrypt = StringEncrypt.encrypt(llave.getClave(), llave.getVector(), texto);
			return telefonoEncrypt;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String desEncriptarTexto(String texto, Llave llave) {
		try {
			String telefonoDecrypt = StringEncrypt.decrypt(llave.getClave(), llave.getVector(), texto);
			return telefonoDecrypt;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
