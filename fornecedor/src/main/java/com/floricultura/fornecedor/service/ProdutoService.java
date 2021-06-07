package com.floricultura.fornecedor.service;

import java.util.List;

import com.floricultura.fornecedor.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floricultura.fornecedor.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}

	
}
