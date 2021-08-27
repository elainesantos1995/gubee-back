package com.gubee.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.gubee.model.Tecnologia;
import com.gubee.repository.TecnologiaRepository;
import com.gubee.service.TecnologiaService;

@Service
public class TecnologiaServiceImpl implements TecnologiaService{
	
	@Autowired
	private TecnologiaRepository repository;

	@Override
	public Tecnologia save(Tecnologia tecnologia) {
		return this.repository.save(tecnologia);
	}

	@Override
	public void update(int id, Tecnologia tecnologiaNova) {
		Optional<Tecnologia> tecnologia = this.repository.findById(id);
		
		if(tecnologia.isPresent()) {
			this.repository.save(tecnologiaNova);
		}else {
			ResponseStatusException exception = new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Tecnologia não encontrada!");
			throw exception;
		}
		
	}

	@Override
	public void delete(int id) {
		this.repository.findById(id). map(tecnologia -> {
			this.repository.delete(tecnologia);
			return tecnologia;
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tecnologia não encontrada"));
		
	}

	@Override
	public Tecnologia getById(int id) {
		return this.repository.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tecnologia não encontrada!"));
	}

	@Override
	public List<Tecnologia> getAll() {
		return repository.findAll();
	}

}
