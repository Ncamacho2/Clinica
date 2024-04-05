package com.poligran.clinicas.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cita extends Dominio{
	
	private String nombre;
}
