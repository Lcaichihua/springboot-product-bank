package com.cavetech.springboot.productbank.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.cavetech.springboot.productbank.app.domain.ProductBank;


public interface ProductBankRepository extends ReactiveMongoRepository<ProductBank, String>{

}
