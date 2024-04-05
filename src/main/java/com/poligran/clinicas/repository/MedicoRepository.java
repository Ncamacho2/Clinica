package com.poligran.clinicas.repository;

import org.springframework.stereotype.Repository;

import com.poligran.clinicas.model.Medico;


@Repository
public interface MedicoRepository extends CustomCrudRepository<Medico> {

}