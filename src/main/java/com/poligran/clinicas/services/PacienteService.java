package com.poligran.clinicas.services;

import org.springframework.stereotype.Service;

import com.poligran.clinicas.dto.PacienteDto;
import com.poligran.clinicas.model.Paciente;

@Service
public interface PacienteService extends CrudService<Paciente, PacienteDto> {
}