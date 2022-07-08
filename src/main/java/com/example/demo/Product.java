package com.example.demo;

import javax.persistence.*;

@Entity
public class Product {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Integer id;
	private String name;

	public Product() {
	}
}
