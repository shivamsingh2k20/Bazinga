package com.shivam.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.shivam.ecommerce.model.Product;
import com.shivam.ecommerce.service.ProductService;

@SpringBootApplication
public class BazingaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BazingaApplication.class, args);
	}
	
	@Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "N-95 Mask", 800.00,1000L));
            productService.save(new Product(2L, "PPE Kit", 2000.00,500L));
            productService.save(new Product(3L, "Washable Mask", 100.00,2000L));
            productService.save(new Product(4L, "Sanitizer", 150.00, 500L));
            productService.save(new Product(5L, "Handwash", 100.00,5000L));
            
        };
    }

}
