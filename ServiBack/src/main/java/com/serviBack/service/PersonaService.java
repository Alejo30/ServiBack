package com.serviBack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviBack.model.Persona;
import com.serviBack.repository.IPersonaRepo;

@Service
public class PersonaService {

	@Autowired
	private IPersonaRepo personaRepositorio;
	
	public Persona crearPersona(Persona persona) {
		return personaRepositorio.insert(persona);
	}
	
	public Persona infoPersona(String cedula) {
		return personaRepositorio.findByCedula(cedula);
	}
	
	public Persona editarPersona(Persona persona) {
		return personaRepositorio.save(persona);
	}
	
	public void eliminarPersona(String cedula) {
		personaRepositorio.deleteByCedula(cedula);
	}
}
