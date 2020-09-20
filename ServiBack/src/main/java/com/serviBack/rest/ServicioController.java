package com.serviBack.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviBack.model.Servicio;
import com.serviBack.service.ServicioService;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

	@Autowired
	private ServicioService service;
	
	@PostMapping("/create")
	public Servicio createServicio(@RequestBody Servicio servicio) {
		return service.crearServicio(servicio);
	}
	
	@GetMapping("/{empresaId}")
	public List<Servicio> findServiciosEmpresa(@PathVariable String empresaId){
		return service.buscarServicios(empresaId);
	}
	
	@GetMapping("/listAll")
	public List<Servicio> listServicios(){
		return service.listaServicios();
	}
	
	@PutMapping("/update")
	public Servicio editarServicio(@RequestBody Servicio servicio) {
		return service.editarEmpresa(servicio);
	}
	
	@DeleteMapping("/{id}")
	public void deleteServicio(@PathVariable String id) {
		service.eliminarEmpresa(id);
	}
	
}
