package com.sliit.mtit.microservice.orderservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservice.orderservice.dto.orderRequest;
import com.sliit.mtit.microservice.orderservice.dto.orderResponse;

@RestController
@RequestMapping("/orders")

public class OrderController {
	
	/*@PostMapping(consumes = "application/json", produces = "application/json")
	public void createOrder() {
	*/
		
		
		@PostMapping (consumes = "application/json", produces ="application/json")
		public @ResponseBody 
		orderResponse createOrder (@RequestBody orderRequest request) {
	
			/* System.out.println(" Order details : " +request);*/
		      System.out.println("Order details => " + request.toString());
			
			var orderresponse = new orderResponse();
			orderresponse.setOrderId(UUID.randomUUID().toString());
			orderresponse.setMessage("Succesfully created the order");
			return orderresponse;
		}
	
		
}
	
	


