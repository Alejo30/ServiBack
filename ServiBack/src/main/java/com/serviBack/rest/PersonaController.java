package com.serviBack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviBack.model.Persona;
import com.serviBack.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	PersonaService personaServicio;
	
	@PostMapping("/create")
	public Persona createPersona(@RequestBody Persona persona) {
		return personaServicio.crearPersona(persona);
	}
	
	@GetMapping(path = "/login", produces = "application/json")
	public boolean login(String cedula, String password) {
		return personaServicio.login(cedula, password);
	}
	
	@PutMapping("/update")
	public Persona updatePersona(@RequestBody Persona persona) {
		return personaServicio.editarPersona(persona);
	}
	
	@GetMapping("/{cedula}")
	public Persona findByCedula(@PathVariable String cedula) {
		return personaServicio.infoPersona(cedula);
	}
	
	@DeleteMapping("/{cedula}")
	public void deletePersona(@PathVariable String cedula) {
		this.personaServicio.eliminarPersona(cedula);
	}	
}
