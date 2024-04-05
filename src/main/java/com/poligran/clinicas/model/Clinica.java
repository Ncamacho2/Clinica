package com.poligran.clinicas.model;

import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Clinica extends Dominio{
	private String nombre;
	private String direccion;
	private String telefono;
	/*
	 * private List<Medico> medicos; private List<Paciente> pacientes; private
	 * List<Cita> citas; private List<Factura> facturas;
	 */

}
