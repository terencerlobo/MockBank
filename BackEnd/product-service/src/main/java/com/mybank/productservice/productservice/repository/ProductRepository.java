package com.mybank.productservice.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybank.productservice.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByproductCd(String productCd);

}
