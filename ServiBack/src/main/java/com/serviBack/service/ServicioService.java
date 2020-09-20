package com.serviBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviBack.model.Servicio;
import com.serviBack.repository.IServicioRepo;

@Service
public class ServicioService {

	@Autowired
	private IServicioRepo servicioRepo;
	
	public Servicio crearServicio(Servicio servicio) {
		return servicioRepo.insert(servicio);
	}
	
	public List<Servicio> buscarServicios(String empresaId){
		return servicioRepo.findByEmpresaId(empresaId);
	}
	
	public List<Servicio> listaServicios(){
		return servicioRepo.findAll();
	}
	
	public Servicio editarEmpresa(Servicio servicio) {
		return servicioRepo.save(servicio);
	}
	
	public void eliminarEmpresa(String id) {
		servicioRepo.deleteById(id);
	}
}
