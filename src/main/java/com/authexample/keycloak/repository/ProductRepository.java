package com.authexample.keycloak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authexample.keycloak.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
