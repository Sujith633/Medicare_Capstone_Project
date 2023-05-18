package com.example.MediCare_Backend.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MediCare_Backend.model.Product;
import com.example.MediCare_Backend.repository.ProductRespository;


@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductRespository respository;
	
	@GetMapping("/")
	Iterable<Product> getproducts(){
		return respository.findAll();
	}
}
