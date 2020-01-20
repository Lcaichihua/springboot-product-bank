package com.cavetech.springboot.productbank.app.service;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


import com.cavetech.springboot.productbank.app.domain.TypeProductBank;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



public interface TypeProductService  {

	Mono<TypeProductBank> save(TypeProductBank typeProductBank);


	Flux<TypeProductBank> findAll();

	Mono<TypeProductBank> findById(String id);

	Mono<Void> deletexId(String id);

	Mono<Void> delete(TypeProductBank typeProductBank);
	
}
