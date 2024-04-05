package com.poligran.clinicas.services;

import org.springframework.stereotype.Service;

import com.poligran.clinicas.dto.ClinicaDto;
import com.poligran.clinicas.model.Clinica;


@Service
public interface ClinicaService extends CrudService<Clinica, ClinicaDto> {
}