package com.mybank.productservice.productservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybank.productservice.productservice.entity.Product;
import com.mybank.productservice.productservice.repository.ProductRepository;

@Service
public class ProductDAO {
	
	@Autowired
	ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	public Product getProductByCd(String productCd) {
		return repository.findByproductCd(productCd);
	}

}
