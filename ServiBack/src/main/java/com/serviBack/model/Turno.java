package com.serviBack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Turno {
	
	@Id
	private String id;
	private String fecha;
	private String hora;
	private String usuarioId;
	private String servicioId;
}
