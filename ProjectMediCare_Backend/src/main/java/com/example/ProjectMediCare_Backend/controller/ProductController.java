package com.example.ProjectMediCare_Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectMediCare_Backend.model.Product;
import com.example.ProjectMediCare_Backend.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductRepository respository;
	
	@GetMapping("/")
	Iterable<Product> getproducts(){
		return respository.findAll();
	}
}
