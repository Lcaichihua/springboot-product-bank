package com.cavetech.springboot.productbank.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import com.cavetech.springboot.productbank.app.domain.ProductBank;
import com.cavetech.springboot.productbank.app.domain.TypeProductBank;
import com.cavetech.springboot.productbank.app.repository.ProductBankRepository;
import com.cavetech.springboot.productbank.app.repository.TypeProductRepository;

import reactor.core.publisher.Flux;


@EnableEurekaClient
@SpringBootApplication
public class SpringbootProductBankApplication implements CommandLineRunner  {

	
	@Autowired
	private ProductBankRepository productbank;

	@Autowired
	private TypeProductRepository typeprodbank;
	
	@Autowired
	private ReactiveMongoTemplate template;


	public static void main(String[] args) {
		SpringApplication.run(SpringbootProductBankApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.dropCollection(ProductBank.class).subscribe();
		template.dropCollection(TypeProductBank.class).subscribe();
	
		
		
		
		TypeProductBank type1 = new TypeProductBank();
		type1.setDescription("Cuenta Bancaria");
			
		
		
		
		Flux.just(type1)
		.flatMap(tipP -> typeprodbank.save(tipP))
		.thenMany(	
				Flux.just(new ProductBank("Cuenta de ahorro" ,  type1,1),
						  new ProductBank("Cuentas corrienteas" ,  type1,2),
						  new ProductBank("Cuentas a plazo fijo" ,  type1,3)
				
					)	
				).flatMap(pro -> productbank.save(pro))
		.subscribe(res -> System.out.println("Producto".concat(res.toString().concat(" " + "Registrado"))));
		
	}
		
		
		
	}


