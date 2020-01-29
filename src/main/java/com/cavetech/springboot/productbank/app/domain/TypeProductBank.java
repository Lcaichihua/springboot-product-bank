package com.cavetech.springboot.productbank.app.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "typeProductBank")
public @Data class TypeProductBank {
	@Id
	private String id;
	private String description;
	
	public TypeProductBank(String description) {
		super();
		this.description = description;
	
	}
	
	

	
	
}
