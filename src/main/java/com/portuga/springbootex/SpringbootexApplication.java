package com.portuga.springbootex;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.portuga.springbootex.domain.Category;
import com.portuga.springbootex.domain.Product;
import com.portuga.springbootex.repositories.ICatergoryRepository;
import com.portuga.springbootex.repositories.IProductRepository;

@SpringBootApplication
public class SpringbootexApplication implements CommandLineRunner {

	@Autowired
	private ICatergoryRepository catergoryRepository;
	@Autowired
	private IProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootexApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");

		Product pro1 = new Product(null, "Computador", 2000.00);
		Product pro2 = new Product(null, "Impressora", 800.00);
		Product pro3 = new Product(null, "Mouse", 800.00);

		cat1.getProductList().addAll(Arrays.asList(pro1, pro2, pro3));
		cat2.getProductList().addAll(Arrays.asList(pro2));
		
		pro1.getCategoryList().addAll(Arrays.asList(cat1));
		pro2.getCategoryList().addAll(Arrays.asList(cat1, cat2));
		pro3.getCategoryList().addAll(Arrays.asList(cat1));

		catergoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(pro1, pro2, pro3));
	}

}
