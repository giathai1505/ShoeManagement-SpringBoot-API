package net.codejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.models.Product;
import net.codejava.services.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	@GetMapping("/products")
	public List<Product> allProducts()
	{
		return service.getAllProducts();
	}

}