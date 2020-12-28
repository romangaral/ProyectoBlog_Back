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

import com.daw.models.entity.Entrada;
import com.daw.models.services.IEntradaService;

@RestController
@RequestMapping("/entradas")
public class EntradaController {

	@Autowired
	private IEntradaService entradaService;
	
	@GetMapping
	public List<Entrada> listar(Model model){
		return entradaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Entrada mostrar(@PathVariable Long id) {
		return this.entradaService.findById(id);
	}
	
	@PostMapping
	public Entrada create(@RequestBody Entrada entrada) {
		entrada.setFechaSubida(new Date());
		this.entradaService.save(entrada);
		return entrada;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		this.entradaService.delete(id);
	}
	
}
