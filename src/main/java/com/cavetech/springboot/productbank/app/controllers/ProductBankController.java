package com.cavetech.springboot.productbank.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cavetech.springboot.productbank.app.domain.ProductBank;
import com.cavetech.springboot.productbank.app.service.ProductBankService;

import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequestMapping("productbank")
@RestController
public class ProductBankController {
	
	@Autowired
	private  ProductBankService prodbankservice;

	@GetMapping("/list")
	@ApiOperation(value = "List ProductBank", notes="all productbank")
	public Flux<ProductBank> findAll() {
		return prodbankservice.findAll();
	}

	@GetMapping("/{id}")
	public Mono<ProductBank> finById(@PathVariable String id){
		return prodbankservice.findById(id);
	}

	@PostMapping
	public Mono<ProductBank> save(@RequestBody ProductBank prodbank) {
		return prodbankservice.save(prodbank);
	}

	@PutMapping
	public Mono<ProductBank> update(@RequestBody ProductBank prodbank) {
		return prodbankservice.save(prodbank);
	}

	
	@DeleteMapping("/{id}")
	public Mono<Void> eliminarProducto(@PathVariable String id) {
		return prodbankservice.deletexId(id);
	}

}
