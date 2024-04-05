package com.poligran.clinicas.services;

import org.springframework.stereotype.Service;

import com.poligran.clinicas.dto.CitaDto;
import com.poligran.clinicas.model.Cita;

@Service
public interface CitaService extends CrudService<Cita, CitaDto> {
}