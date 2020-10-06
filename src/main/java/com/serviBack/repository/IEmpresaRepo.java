package com.serviBack.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serviBack.model.Empresa;


public interface IEmpresaRepo extends MongoRepository<Empresa, String>{

	Empresa findBypersonaId(String cedula);
}
