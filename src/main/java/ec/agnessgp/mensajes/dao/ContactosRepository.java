package ec.agnessgp.mensajes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.agnessgp.mensajes.modelo.MediosContacto;

public interface ContactosRepository extends JpaRepository<MediosContacto, Long> {

}
