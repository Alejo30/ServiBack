package com.serviBack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Servicio {
	
	@Id
	private String id;
	private String nombre;
	private String descripcion;
	private String foto;
	private double precio;
	private String empresaId;
}
