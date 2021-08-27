package com.gubee.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gubee.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
	@Query("SELECT distinct p FROM Produto p "
			+ "JOIN p.tecnologias t "
			+ "WHERE (COALESCE(:tecnologias, NULL) IS NULL OR t.nome IN :tecnologias) "
			+ "AND (p.mercadoAlvo = :mercadoAlvo OR :mercadoAlvo is NULL) ")
	public List<Produto> getAllByFilterPersonal(@Param("tecnologias") Set<String> tecnologias, 
			@Param("mercadoAlvo") String mercadoAlvo);

}
