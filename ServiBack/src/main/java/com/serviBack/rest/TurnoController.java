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

import com.serviBack.model.Turno;
import com.serviBack.service.TurnoService;

@RestController
@RequestMapping("/turno")
public class TurnoController {

	@Autowired
	private TurnoService turnoServicio;
	
	@PostMapping("/create")
	public Turno createTurno(@RequestBody Turno turno) {
		return turnoServicio.crearTurno(turno); 
	}
	
	@GetMapping("/{empresaId}")
	public List<Turno> findTurnos(@PathVariable String servicioId){
		return turnoServicio.buscarTurnos(servicioId);
	}
	
	@PutMapping("/update")
	public Turno updateTurno(@RequestBody Turno turno){
		return turnoServicio.editarTurno(turno);
	}

	@DeleteMapping("/{id}")
	public void deleteTurno(@PathVariable String id){
		turnoServicio.eliminarTurno(id);
	}
}
