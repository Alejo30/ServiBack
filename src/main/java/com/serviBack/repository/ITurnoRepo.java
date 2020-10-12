package com.serviBack.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.serviBack.model.Servicio;
import com.serviBack.model.Turno;

public interface ITurnoRepo extends MongoRepository<Turno, String> {
	
	List<Turno> findByServicioId(String servicioId);
	
	List<Turno> findByPersonaId(String personaId);

	Turno findByFechaAndHoraAndServicioId(String fecha, String hora, String servicioId);
	
	@Query("{_id:'?0'}")
	Turno findByTurnoId(String _id);

}
