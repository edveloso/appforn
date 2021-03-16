package com.edveloso.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edveloso.fornecedor.model.InfoFornecedor;
import com.edveloso.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	public InfoService infoService;
	
	 @GetMapping(value="/{estado}", produces=MediaType.APPLICATION_JSON_VALUE)
	public InfoFornecedor getPorEstado(@PathVariable String estado) {
			return new InfoFornecedor(1l, "jose", estado);
	}
	
	
	@PostMapping
	public InfoFornecedor save(@RequestBody InfoFornecedor fornecedor) {
		return infoService.save(fornecedor);
	}


	public InfoService getInfoService() {
		return infoService;
	}


	public void setInfoService(InfoService infoService) {
		this.infoService = infoService;
	}
	
}
