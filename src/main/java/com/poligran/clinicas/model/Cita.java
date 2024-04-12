package com.poligran.clinicas.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cita extends Dominio {
	private Integer pacienteId;
	private String pacienteNombre;
	private Integer medicoId;
	private String medicoNombre;
	private String motivoConsulta;
}
