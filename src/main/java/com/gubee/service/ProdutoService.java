package com.gubee.service;

import java.util.List;

import com.gubee.model.Produto;

public interface ProdutoService {
	
	public Produto save(Produto produto);
	public void update(int id, Produto produtoNovo);
	public void delete(int id);
	public Produto getById(int id);
	public List<Produto> getAll();

}
