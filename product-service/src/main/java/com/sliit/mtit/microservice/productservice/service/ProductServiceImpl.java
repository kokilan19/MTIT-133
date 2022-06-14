package com.sliit.mtit.microservice.productservice.service;


import java.util.UUID;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate;
 

import com.sliit.mtit.microservice.productservice.dto.CustomerCreationRequest;
import com.sliit.mtit.microservice.productservice.dto.CustomerCreationResponse;
import com.sliit.mtit.microservice.productservice.dto.SupplierCreationRequest;
import com.sliit.mtit.microservice.productservice.dto.SupplierCreationResponse;
import com.sliit.mtit.microservice.productservice.dto.productRequest;
import com.sliit.mtit.microservice.productservice.dto.productResponse;

@Service
public class ProductServiceImpl {

		
@Autowired
private RestTemplate restTemplate;


public productResponse createProduct(productRequest productrequest) {

	var customerCreationRequest = new CustomerCreationRequest();
	customerCreationRequest.setCustomerName(productrequest.getCustomerName());
	customerCreationRequest.setCustomerJobTittle(productrequest.getCustomerJobTittle());   
	
	var supplierCreationRequest = new SupplierCreationRequest();
	supplierCreationRequest.setSupplierName(productrequest.getSupplierName());
	supplierCreationRequest.setSupplierName(productrequest.getSupplierAddress());
	

	ResponseEntity<CustomerCreationResponse> customerCreationResponse =   restTemplate.postForEntity( "http://localhost:8080/customers", customerCreationRequest, CustomerCreationResponse.class);
	ResponseEntity<SupplierCreationResponse> supplierCreationResponse =   restTemplate.postForEntity( "http://localhost:9090/suppliers", supplierCreationRequest, SupplierCreationResponse.class);
	  
	var productresponse = new productResponse();
		productresponse.setProductId(UUID.randomUUID().toString());
		productresponse.setCustomerId(customerCreationResponse.getBody().getCustomerId());
		productresponse.setSupplierId(supplierCreationResponse.getBody().getSupplierId());
		productresponse.setMessage("Succesfully created the Product");
		
	
		
		return productresponse;
}


		

		@Bean
		public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
}
}
