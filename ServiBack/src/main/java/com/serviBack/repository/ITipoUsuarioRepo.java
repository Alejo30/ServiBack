package com.serviBack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serviBack.model.TipoUsuario;

public interface ITipoUsuarioRepo extends MongoRepository<TipoUsuario, String>{

}
