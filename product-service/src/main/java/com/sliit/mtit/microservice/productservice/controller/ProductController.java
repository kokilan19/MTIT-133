package com.sliit.mtit.microservice.productservice.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservice.productservice.dto.productRequest;
import com.sliit.mtit.microservice.productservice.dto.productResponse;
import com.sliit.mtit.microservice.productservice.service.ProductServiceImpl;



@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductServiceImpl productservice;
		
		/*@PostMapping(consumes = "application/json", produces = "application/json")
	public void createOrder() {
	*/
		@PostMapping (consumes = "application/json", produces ="application/json")
		public @ResponseBody 
		productResponse createProduct (@RequestBody productRequest productrequest) {
	
			
		      System.out.println("Product details : " + productrequest);
			return productservice.createProduct(productrequest);
		      
		     
}
}	
