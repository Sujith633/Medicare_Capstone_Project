package com.example.ProjectMediCare_Backend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ProjectMediCare_Backend.model.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {
	List<Product> findByName(String name);
	List<Product> findAll();
	List<Product> findByNameAndId(String name);
	List<Product> findAllOrderByPrice();
}
