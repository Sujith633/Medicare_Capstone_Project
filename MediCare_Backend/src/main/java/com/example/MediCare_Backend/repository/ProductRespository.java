package com.example.MediCare_Backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.MediCare_Backend.model.Product;



public interface ProductRespository extends JpaRepository<Product,Integer>{
	
//	List<Product> findByName(String name);
//	List<Product> findAll();
//	List<Product> findByNameAndId(String name);

}
