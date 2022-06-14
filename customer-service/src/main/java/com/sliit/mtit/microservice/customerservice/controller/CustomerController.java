package com.sliit.mtit.microservice.customerservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservice.customerservice.dto.customerRequest;
import com.sliit.mtit.microservice.customerservice.dto.customerResponse;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	/*@PostMapping(consumes = "application/json", produces = "application/json")
	public void createOrder() {
	*/
		
		
		@PostMapping (consumes = "application/json", produces ="application/json")
		public @ResponseBody 
		customerResponse createCustomer (@RequestBody customerRequest customerrequest) {
	
			/* System.out.println(" Order details : " +request);*/
		      System.out.println("Customer details : " + customerrequest);
			
			var customerresponse = new customerResponse();
			customerresponse.setCustomerId(UUID.randomUUID().toString());
			customerresponse.setMessage("Successfully created the Customer");
			return customerresponse;
		}

}
