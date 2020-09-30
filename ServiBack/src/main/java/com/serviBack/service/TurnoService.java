package com.serviBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviBack.model.Turno;
import com.serviBack.repository.ITurnoRepo;

@Service
public class TurnoService {

	@Autowired
	private ITurnoRepo turnoRepo;
	
	public Turno crearTurno(Turno turno){
		return turnoRepo.insert(turno);
	}
	
	public List<Turno> buscarTurnos(String servicioId){
		return turnoRepo.findByServicioId(servicioId);
	}
	
	public List<Turno> buscarTurnosPersona(String personaId){
		return turnoRepo.findByPersonaId(personaId);
	}
	
	public Turno editarTurno(Turno turno) {
		return turnoRepo.save(turno);	
	}
	
	public void eliminarTurno(String id) {
		turnoRepo.deleteById(id);
	}
	
	public boolean turnoDisponible(String fecha, String hora) {
		turnoRepo.findByFechaAndHora(fecha, hora);
		if(turnoRepo.findByFechaAndHora(fecha, hora) == null) {
			return false;
		}else {
			return true;
		}
	}
}
