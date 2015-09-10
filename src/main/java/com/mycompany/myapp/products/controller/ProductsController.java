package com.mycompany.myapp.products.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsController {

	@RequestMapping(path = "/productsMain", method = RequestMethod.GET)
	public String initial() {
		return "products";
	}
	
}
