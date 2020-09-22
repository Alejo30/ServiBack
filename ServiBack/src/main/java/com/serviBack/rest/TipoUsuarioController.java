package com.serviBack.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviBack.model.TipoUsuario;
import com.serviBack.service.TipoUsuarioService;

@RestController
@RequestMapping("/tipoUser")
@CrossOrigin
public class TipoUsuarioController {

	@Autowired
	private TipoUsuarioService tipoServicio;

	@GetMapping
	public List<TipoUsuario> findTipoUsers(){
		return tipoServicio.buscarTipos();
	}
}
