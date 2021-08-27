package com.gubee.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomeProduto;
	private	String descricaoSimples;
	private String mercadoAlvo;
	
	@ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name="tecnologias_do_produto", joinColumns=
    {@JoinColumn(name="produto_id")}, inverseJoinColumns=
    {@JoinColumn(name="tecnologia_id")})	
	private List<Tecnologia> tecnologias;
	
	public Produto() {
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricaoSimples == null) ? 0 : descricaoSimples.hashCode());
		result = prime * result + id;
		result = prime * result + ((mercadoAlvo == null) ? 0 : mercadoAlvo.hashCode());
		result = prime * result + ((nomeProduto == null) ? 0 : nomeProduto.hashCode());
		result = prime * result + ((tecnologias == null) ? 0 : tecnologias.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (descricaoSimples == null) {
			if (other.descricaoSimples != null)
				return false;
		} else if (!descricaoSimples.equals(other.descricaoSimples))
			return false;
		if (id != other.id)
			return false;
		if (mercadoAlvo == null) {
			if (other.mercadoAlvo != null)
				return false;
		} else if (!mercadoAlvo.equals(other.mercadoAlvo))
			return false;
		if (nomeProduto == null) {
			if (other.nomeProduto != null)
				return false;
		} else if (!nomeProduto.equals(other.nomeProduto))
			return false;
		if (tecnologias == null) {
			if (other.tecnologias != null)
				return false;
		} else if (!tecnologias.equals(other.tecnologias))
			return false;
		return true;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoSimples() {
		return descricaoSimples;
	}

	public void setDescricaoSimples(String descricaoSimples) {
		this.descricaoSimples = descricaoSimples;
	}

	public String getMercadoAlvo() {
		return mercadoAlvo;
	}

	public void setMercadoAlvo(String mercadoAlvo) {
		this.mercadoAlvo = mercadoAlvo;
	}

	public List<Tecnologia> getTecnologias() {
		return tecnologias;
	}

	public void setTecnologias(List<Tecnologia> tecnologias) {
		this.tecnologias = tecnologias;
	}
	

}
