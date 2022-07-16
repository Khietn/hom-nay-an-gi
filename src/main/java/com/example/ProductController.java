package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	@Autowired
	private ApplicationContext appContext;
	
	@GetMapping("/products")
	public List<Product> listAll(){
		
		return service.listAll();
	}
	
	@GetMapping("/test")
	public String test() {
		return "lmao";
	}
}
