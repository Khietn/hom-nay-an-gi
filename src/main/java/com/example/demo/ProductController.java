package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> listAll(){
		return service.listAll();
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
