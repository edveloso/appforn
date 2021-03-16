package com.edveloso.fornecedor.service;

import org.springframework.stereotype.Service;

import com.edveloso.fornecedor.model.InfoFornecedor;
import com.edveloso.fornecedor.repository.InfoRepository;

@Service
public class InfoService {

	private InfoRepository infoRepository;

	public InfoFornecedor getPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}

	public InfoFornecedor save(InfoFornecedor fornecedor) {
		return infoRepository.save(fornecedor);
	}

}
