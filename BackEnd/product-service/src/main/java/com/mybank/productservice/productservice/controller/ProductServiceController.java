package com.mybank.productservice.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.productservice.productservice.dao.ProductDAO;
import com.mybank.productservice.productservice.dao.ProductEnrollmentDAO;
import com.mybank.productservice.productservice.entity.Product;
import com.mybank.productservice.productservice.entity.ProductEnrollment;

@RestController
@RequestMapping("/product-service")
public class ProductServiceController {
	
	@Autowired
	private ProductDAO productDao;
	
	@Autowired
	private ProductEnrollmentDAO productEnrollmentDao;
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return productDao.saveProduct(product);
	}
	
	@GetMapping("/getProductByCd/{productCd}")
	public Product getProductByCd(@PathVariable("productCd") String productCd) {
		return productDao.getProductByCd(productCd);
	}
	
	@PostMapping("/saveProductEnrollment")
	public ProductEnrollment saveProductEnrollment(@RequestBody ProductEnrollment productEnrollment) {
		return productEnrollmentDao.saveProductEnrollment(productEnrollment);
	}
	
	@GetMapping("/findBycompanyCEOId")
	public List<ProductEnrollment> findBycompanyCEOId(@RequestParam("ceoId") String ceoId) {
		return productEnrollmentDao.findBycompanyCEOId(ceoId);
	}


}
