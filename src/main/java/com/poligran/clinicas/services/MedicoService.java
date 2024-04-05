package com.poligran.clinicas.services;

import org.springframework.stereotype.Service;

import com.poligran.clinicas.dto.MedicoDto;
import com.poligran.clinicas.model.Medico;

@Service
public interface MedicoService extends CrudService<Medico, MedicoDto> {
}