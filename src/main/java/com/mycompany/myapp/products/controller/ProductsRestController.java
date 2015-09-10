package com.mycompany.myapp.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.myapp.products.model.Product;
import com.mycompany.myapp.products.service.ProductService;

@RestController
public class ProductsRestController {
	
	ProductService productService;  
	
	@Autowired
	public ProductsRestController(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
	public @ResponseBody List<Product> products() {
		return productService.getProducts();
	}
	
}
