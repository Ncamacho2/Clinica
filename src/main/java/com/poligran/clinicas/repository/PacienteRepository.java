package com.poligran.clinicas.repository;

import org.springframework.stereotype.Repository;

import com.poligran.clinicas.model.Paciente;


@Repository
public interface PacienteRepository extends CustomCrudRepository<Paciente> {

}