package com.cavetech.springboot.productbank.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.cavetech.springboot.productbank.app.domain.ProductBank;
import com.cavetech.springboot.productbank.app.repository.ProductBankRepository;
import com.cavetech.springboot.productbank.app.service.ProductBankService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class ProductBankServiceImpl implements ProductBankService {

	@Autowired
	private ProductBankRepository prodbankRepo;
	
	
	@Override
	public Mono<ProductBank> save(ProductBank productBank) {
		
		return this.prodbankRepo.save(productBank);
	}

	

	@Override
	public Flux<ProductBank> findAll() {
		return this.prodbankRepo.findAll();
		
	}

	@Override
	public Mono<ProductBank> findById(String id) {
		return this.prodbankRepo.findById(id);
	}

	@Override
	public Mono<Void> deletexId(String id) {
		return this.prodbankRepo.deleteById(id);
	}

	@Override
	public Mono<Void> delete(ProductBank productBank) {
		return this.prodbankRepo.delete(productBank);
	}

}
