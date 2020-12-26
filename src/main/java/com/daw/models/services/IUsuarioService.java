package com.daw.models.services;

import java.util.List;

import com.daw.models.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public void save(Usuario usuario);
	
	public Usuario findById(Long id);

	public void delete(Long id);
}
