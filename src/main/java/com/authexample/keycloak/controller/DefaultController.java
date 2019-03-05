package com.authexample.keycloak.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.authexample.keycloak.service.ProductService;

@Controller
public class DefaultController {
	
	@Autowired
	private final ProductService productService;
	
	public DefaultController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping("/")
	public String index() {
		System.out.println("Hit");
	    return "external";
	}
	     
	@RequestMapping("/products")
	public String customers(Principal principal, Model model) {
		System.out.println("Hit2");
	    model.addAttribute("products", productService.getAllProducts());
	    model.addAttribute("username", principal.getName());		//	This will allow the name to be displayed on the page
	    return "products";
	}

}
