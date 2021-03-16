package com.edveloso.fornecedor.repository;

import org.springframework.stereotype.Repository;

import com.edveloso.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRepository {

	InfoFornecedor findByEstado(String estado);

	InfoFornecedor save(InfoFornecedor fornecedor);
	
	
	
}
