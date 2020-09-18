package com.serviBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviBack.model.Empresa;
import com.serviBack.repository.IEmpresaRepo;

@Service
public class EmpresaService {

	@Autowired
	IEmpresaRepo empresaRepo;
	
	public Empresa crearEmpresa(Empresa empresa) {
		return empresaRepo.insert(empresa);
	}
	
	public List<Empresa> buscarEmpresas(String cedula){
		return empresaRepo.findBypersonaId(cedula);
	}
	
	public Empresa editarEmpresa(Empresa empresa) {
		return empresaRepo.save(empresa);
	}
	
	public void eliminarEmpresa(String id) {
		empresaRepo.deleteById(id);
	}
	
}
