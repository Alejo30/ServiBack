package com.serviBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviBack.model.TipoUsuario;
import com.serviBack.repository.ITipoUsuarioRepo;

@Service
public class TipoUsuarioService {

	@Autowired
	private ITipoUsuarioRepo tipoRepo;
	public List<TipoUsuario> buscarTipos(){
		return tipoRepo.findAll(); 
	}
}
