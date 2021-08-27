package com.gubee.utils;

import java.util.List;

import com.gubee.model.Tecnologia;

public class ProdutoFilter {
	
	private String mercadoAlvo;
	private List<Tecnologia> tecnologiasDoProduto;
	
	public ProdutoFilter() {
		
	}

	public String getMercadoAlvo() {
		return mercadoAlvo;
	}

	public void setMercadoAlvo(String mercadoAlvo) {
		this.mercadoAlvo = mercadoAlvo;
	}

	public List<Tecnologia> getTecnologiasDoProduto() {
		return tecnologiasDoProduto;
	}

	public void setTecnologiasDoProduto(List<Tecnologia> tecnologiasDoProduto) {
		this.tecnologiasDoProduto = tecnologiasDoProduto;
	}
	
	
	

}
