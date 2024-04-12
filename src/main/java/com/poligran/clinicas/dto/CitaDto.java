package com.poligran.clinicas.dto;

import java.time.LocalDateTime;

import com.poligran.clinicas.model.Medico;
import com.poligran.clinicas.model.Paciente;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CitaDto {
	private Paciente paciente;
    private Medico medico;
    private LocalDateTime fechaHora;
    private String motivoConsulta;
}
