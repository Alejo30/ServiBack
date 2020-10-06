package com.serviBack.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviBack.model.Empresa;
import com.serviBack.service.EmpresaService;


@RestController
@RequestMapping("/empresa")
@CrossOrigin
public class EmpresaController {
	
	@Autowired
	EmpresaService empresaServicio;

	@PostMapping("/create")
	public Empresa createEmpresa(@RequestBody Empresa empresa) {
		return empresaServicio.crearEmpresa(empresa);
	}
	
	@GetMapping("/{cedula}")
	public Empresa findByIdPersona(@PathVariable String cedula){
		return empresaServicio.buscarEmpresas(cedula);
	}
	
	@PutMapping("/update")
	public Empresa editarEmpresa(@RequestBody Empresa empresa) {
		return empresaServicio.editarEmpresa(empresa);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarEmpresa(@PathVariable String id) {
		empresaServicio.eliminarEmpresa(id);
	}
	
}
