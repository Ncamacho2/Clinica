package com.poligran.clinicas.services.impl;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.poligran.clinicas.dto.CitaDto;
import com.poligran.clinicas.model.Cita;
import com.poligran.clinicas.services.CitaService;

@Service
public class CitaServiceImpl implements CitaService{

	@Override
	public CitaDto guardarDto(CitaDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cita guardar(Cita instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cita> guardar(List<Cita> instances) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CitaDto buscatDtoPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cita buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cita> encontarTodosPage(Specification<Cita> specification, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitaDto> encontarTodosDto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitaDto> encontarTodosDto(Example<Cita> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CitaDto> encontarTodosDto(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CitaDto> encontarTodosDto(Example<Cita> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cita> encontarTodos(Example<Cita> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cita> encontarTodos(Example<Cita> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cita> encontarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cita> encontarTodos(Specification<Cita> specification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cita> encontarTodos(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Iterable<Cita> iterable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cita actualizar(Cita instance, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CitaDto actualizarDto(CitaDto dto, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CitaDto obtenerDto(Cita instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cita obtenerInstancia(CitaDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cita obtenerInstanciaParametrosEspeciales(Object dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<Cita> getTypeClassInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cita obtenerInstanciaParametrosEspecialesConsulta(Object dto) {
		// TODO Auto-generated method stub
		return null;
	}
}