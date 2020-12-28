package com.daw.models.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daw.models.entity.Usuario;
import com.daw.models.services.IUsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping(value = "/usuarios")
	public List<Usuario> listar(Model model) {
		return usuarioService.findAll();
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuario mostrar(@PathVariable Long id) {
		return this.usuarioService.findById(id);
	}

	@PostMapping(value = "/save")
	public Usuario create(@RequestBody Usuario usuario) {
		usuario.setFechaAlta(new Date());
		this.usuarioService.save(usuario);
		return usuario;
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void delete(@PathVariable Long id) {
		this.usuarioService.delete(id);
	}

}
