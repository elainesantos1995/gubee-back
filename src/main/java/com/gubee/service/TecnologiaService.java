package com.gubee.service;

import java.util.List;

import com.gubee.model.Tecnologia;

public interface TecnologiaService {
	
	public Tecnologia save(Tecnologia tecnologia);
	public void update(int id, Tecnologia tecnologiaNova);
	public void delete(int id);
	public Tecnologia getById(int id);
	public List<Tecnologia> getAll();

}
