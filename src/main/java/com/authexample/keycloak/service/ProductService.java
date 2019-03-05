package com.authexample.keycloak.service;

import java.util.List;

import com.authexample.keycloak.entity.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	
	public Product getProduct(Long id);

}
