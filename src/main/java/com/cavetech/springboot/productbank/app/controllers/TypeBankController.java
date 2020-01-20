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


import com.cavetech.springboot.productbank.app.domain.TypeProductBank;

import com.cavetech.springboot.productbank.app.service.TypeProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequestMapping("typebank")
@RestController
public class TypeBankController {
	
	@Autowired
	private  TypeProductService typebankserv;

	@GetMapping("/list")
	public Flux<TypeProductBank> findAll() {
		return typebankserv.findAll();
	}

	@GetMapping("/{id}")
	public Mono<TypeProductBank> finById(@PathVariable String id) {
		return typebankserv.findById(id);
	}

	@PostMapping
	public Mono<TypeProductBank> save(@RequestBody TypeProductBank prodbank) {
		return typebankserv.save(prodbank);
	}

	@PutMapping
	public Mono<TypeProductBank> update(@RequestBody TypeProductBank prodbank) {
		return typebankserv.save(prodbank);
	}

	@DeleteMapping("/{id}")
	public Mono<Void> eliminarProducto(@PathVariable String id){
		return typebankserv.deletexId(id);
	}

}
