package com.gubee.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.gubee.model.Produto;
import com.gubee.repository.ProdutoRepository;
import com.gubee.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	@Override
	public Produto save(Produto produto) {
		return this.repository.save(produto);
	}

	@Override
	public void update(int id, Produto produtoNovo) {

		Optional<Produto> produto = this.repository.findById(id);

		if (produto.isPresent()) {
			produtoNovo.setId(id);
			repository.save(produtoNovo);
		} else {
			ResponseStatusException exception = new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Produto não encontrado!");
			throw exception;
		}

	}

	@Override
	public void delete(int id) {
		this.repository.findById(id).map(produto -> {
			this.repository.delete(produto);
			return produto;
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado!"));

	}

	@Override
	public Produto getById(int id) {
		return this.repository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado!"));
	}

	@Override
	public List<Produto> getAll() {
		return this.repository.findAll();
	}

	public List<Produto> getByFilter(String mercadoAlvo, String tecnologias) {
		
		List<Produto> produtosTotal = this.repository.findAll();
		List<Produto> todos = null;

		if (mercadoAlvo == null || tecnologias == null) {
			return todos;
		} else {

			if (mercadoAlvo != null) {
				todos = produtosTotal.stream().filter(p -> p.getMercadoAlvo().equalsIgnoreCase(mercadoAlvo))
						.collect(Collectors.toList());
			}				
		}
		return todos;
	}
	
	public List<Produto> findAllByTecnologias(String tecnologias, String mercadoAlvo) {
		
		List<String> items = new ArrayList<>();
		if(tecnologias != null) {
			items = Arrays.asList(tecnologias.split("\\s*,\\s*"));			
		}
		Set<String> set = new HashSet<>(items);
		
		List<Produto> produtos = this.repository.getAllByFilterPersonal(set, mercadoAlvo);
			
		return produtos;
	}

}
