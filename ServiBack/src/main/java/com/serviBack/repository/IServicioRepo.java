package com.serviBack.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.serviBack.model.Servicio;

public interface IServicioRepo extends MongoRepository<Servicio, String> {

	List<Servicio> findByEmpresaId(String empresaId);
	
	@Query("{_id:'?0'}")
	Servicio findByServicioId(String _id);
}
