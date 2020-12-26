package com.daw.models.services;

import java.util.List;

import com.daw.models.entity.Rol;

public interface IRolService {

	public List<Rol> findAll();

	public void save(Rol rol);

	public Rol findById(Long id);

	public void delete(Long id);
}
