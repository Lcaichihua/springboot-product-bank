package com.cavetech.springboot.productbank.app.domain;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "productBank")
public  @Data  class ProductBank {

	private String id;
	private String description;
	private TypeProductBank typeProductBank;
	private int codigo;
	public ProductBank(String description, TypeProductBank typeProductBank, int codigo) {
		super();
		this.description = description;
		this.typeProductBank = typeProductBank;
		this.codigo = codigo;
	}
	
	
	
	
}
