package com.cavetech.springboot.productbank.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.cavetech.springboot.productbank.app.domain.TypeProductBank;


public interface TypeProductRepository  extends ReactiveMongoRepository<TypeProductBank, String>{

}
