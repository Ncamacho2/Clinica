package com.poligran.clinicas.services;

import org.springframework.stereotype.Service;

import com.poligran.clinicas.dto.FacturaDto;
import com.poligran.clinicas.model.Factura;

@Service
public interface FacturaService extends CrudService<Factura, FacturaDto> {
}