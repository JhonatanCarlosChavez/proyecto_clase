package com.project.consorcio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.entity.Medico;
import com.project.consorcio.repository.MedicoRepository;

@Service
public class MedicoServices {
	@Autowired
	private MedicoRepository repo;
	
	public void registrar(Medico m) {
		repo.save(m);
	}
	
	public void actualizar(Medico m) {
		repo.save(m);
	}
	
	public void eliminarPorID(int cod) {
		repo.deleteById(cod);
	}
	
	public void buscarPorID(int cod) {
		repo.findById(cod).orElse(null);
	}
	
	public List<Medico> listarTodos(){
		return repo.findAll();
	}
}
