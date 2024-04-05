package com.poligran.clinicas.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Clinica extends Dominio{
	private String nombre;
	private String direccion;
	private String telefono;
	/*
	 * private List<Medico> medicos; private List<Paciente> pacientes; private
	 * List<Cita> citas; private List<Factura> facturas;
	 */

}
