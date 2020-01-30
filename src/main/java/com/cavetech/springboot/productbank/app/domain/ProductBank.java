package com.cavetech.springboot.productbank.app.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "productBank")
public  @Data  class ProductBank {
	@Id
	private String id;
	private String description;
	private TypeProductBank typeProductBank;
	private Integer codigo;
	public ProductBank(String description, TypeProductBank typeProductBank, Integer codigo) {
		super();
		this.description = description;
		this.typeProductBank = typeProductBank;
		this.codigo = codigo;
	}
	
	
	
	
}
