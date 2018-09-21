package ec.agnessgp.mensajes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.agnessgp.mensajes.modelo.Mensajes;

public interface MensajesRepository extends JpaRepository<Mensajes, Long> {

	Mensajes findByCodigo(String codigo);
}
