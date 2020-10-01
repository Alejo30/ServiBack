package com.serviBack.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serviBack.model.Turno;

public interface ITurnoRepo extends MongoRepository<Turno, String> {
	
	List<Turno> findByServicioId(String servicioId);
	
	List<Turno> findByPersonaId(String personaId);

	Turno findByFechaAndHoraAndServicioId(String fecha, String hora, String servicioId);

}
