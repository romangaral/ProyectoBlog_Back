package com.daw.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.daw.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
