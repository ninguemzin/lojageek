package com.generation.lojageek.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojageek.model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
	List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
