package com.serviBack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serviBack.model.Persona;

public interface IPersonaRepo extends MongoRepository<Persona, String> {

	Persona findByCedulaAndUsuarioPassword(String cedula, String password);
	Persona findByCedula(String cedula);
	void deleteByCedula(String cedula);

}