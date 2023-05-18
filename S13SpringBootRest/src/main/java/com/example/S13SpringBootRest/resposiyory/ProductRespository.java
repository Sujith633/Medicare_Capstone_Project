package com.example.S13SpringBootRest.resposiyory;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.S13SpringBootRest.entity.Product;


public interface ProductRespository extends CrudRepository<Product,Integer>{

	 @Query("FROM Product ORDER BY price ASC")
	 List<Product> findAllOrderByPrice();

//	 @Query("FROM Product ORDER BY name ASC")
//	 List<Product> findAllOrderByNameAsc();

//	List<Product> findAllOrderByNameAsc(Sort sort);
	
//	List<Product> findByName(String name);
//	List<Product> findAll();
//	List<Product> findByNameAndId(String name);

}
