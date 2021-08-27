package com.gubee.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gubee.model.Produto;
import com.gubee.service.impl.ProdutoServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("gubee/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoServiceImpl service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Produto save(@RequestBody Produto produto) {
		return this.service.save(produto);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@PathVariable Integer id, @RequestBody Produto produto) {
		this.service.update(id, produto);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Integer id) {
		this.service.delete(id);
	}
	
	@GetMapping("{id}")
	@ResponseStatus(HttpStatus.OK)
	public Produto getById(@PathVariable Integer id) {
		return this.service.getById(id);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Produto> getAll(){
		return this.service.getAll();
	}
	
	@GetMapping("/filter/{tecnologias}/{mercadoAlvo}")
	@ResponseStatus(HttpStatus.OK)	
	public List<Produto> getByFilter(@RequestParam(required = false) String tecnologias, @RequestParam(required = false) String mercadoAlvo) {
		
		if((tecnologias.equals("")) || (mercadoAlvo.equals(""))) {
			return this.service.getAll();
		}else {
			return this.service.findAllByTecnologias(tecnologias, mercadoAlvo);			
		}
		
	}
	
	// :8090/produtos?tecnologias=React, Java, Lua&mercadoAlvo=Mercado 1, Mercado 2

}