package com.daw.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.models.dao.IEntradaDao;
import com.daw.models.entity.Entrada;

@Service
public class EntradaServiceImpl implements IEntradaService {

	@Autowired
	private IEntradaDao entradaDao;
	
	@Override
	public List<Entrada> findAll() {
		return (List<Entrada>) entradaDao.findAll();
	}

	@Override
	public void save(Entrada entrada) {
		entradaDao.save(entrada);
	}

	@Override
	public Entrada findById(Long id) {
		return entradaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		entradaDao.deleteById(id);
	}

}
