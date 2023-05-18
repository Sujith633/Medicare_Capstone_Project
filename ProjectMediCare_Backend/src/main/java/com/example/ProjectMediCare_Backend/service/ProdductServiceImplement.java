package com.example.ProjectMediCare_Backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ProjectMediCare_Backend.model.Product;
import com.example.ProjectMediCare_Backend.repository.ProductRepository;


@Service
public class ProdductServiceImplement implements ProductService{

		
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product saveProduct(Product product) {
		
		return productRepo.save(product);
	}

	@Override
	public String deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		Product product = productRepo.findById(id).get();

		if (product != null) {
			productRepo.delete(product);
			return "Product Delete Sucessfully";
		}

		return "Something wrong on server";
	}

	@Override
	public Product editProduct(Product p, Integer id) {

		Product oldProduct = productRepo.findById(id).get();

		oldProduct.setName(p.getName());
		oldProduct.setDes(p.getDes());
		oldProduct.setPrice(p.getPrice());
		oldProduct.setStatus(p.getStatus());

		return productRepo.save(oldProduct);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return (List<Product>) productRepo.findAll();

	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

	@Override
	public List<Product> findAllOrderByPrice() {
		// TODO Auto-generated method stub
		return productRepo.findAllOrderByPrice();
	}

//	@Override
//	public List<Product> findAllOrderByNameAsc() {
//		// TODO Auto-generated method stub
//	    return productRepo.findAllOrderByNameAsc();
//	}

}
