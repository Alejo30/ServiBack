package com.serviBack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Empresa {
	@Id
	private String ruc;
	private String nombre;
	private Direccion direccion;
	private String personaId;
}
