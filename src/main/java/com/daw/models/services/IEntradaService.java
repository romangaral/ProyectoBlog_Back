package com.daw.models.services;

import java.util.List;

import com.daw.models.entity.Entrada;

public interface IEntradaService {
	
	public List<Entrada> findAll();

	public void save(Entrada entrada);

	public Entrada findById(Long id);

	public void delete(Long id);

}
