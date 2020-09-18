package com.serviBack.model;

import lombok.Data;

@Data
public class Usuario {
	
	private String password;
	private String fechaCreacion;
	private boolean tipoEmpresario;
}
