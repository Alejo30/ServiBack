package com.serviBack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.serviBack.model.Persona;

public interface IPersonaRepo extends MongoRepository<Persona, String> {

	Persona findByCedula(String cedula);
	void deleteByCedula(String cedula);


}
