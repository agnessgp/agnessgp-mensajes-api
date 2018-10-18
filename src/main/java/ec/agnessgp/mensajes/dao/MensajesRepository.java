package ec.agnessgp.mensajes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.agnessgp.mensajes.modelo.Mensaje;

public interface MensajesRepository extends JpaRepository<Mensaje, Long> {

	Mensaje findByCodigo(String codigo);
}
