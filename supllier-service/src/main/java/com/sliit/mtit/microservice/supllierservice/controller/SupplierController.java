package com.sliit.mtit.microservice.supllierservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit.microservice.supllierservice.dto.supplierRequest;
import com.sliit.mtit.microservice.supllierservice.dto.supplierResponse;


@RestController
@RequestMapping("/suppliers")
public class SupplierController {

	/*@PostMapping(consumes = "application/json", produces = "application/json")
	public void createOrder() {
	*/
		
		
		@PostMapping (consumes = "application/json", produces ="application/json")
		public @ResponseBody 
		supplierResponse createSupplier (@RequestBody supplierRequest supplierrequest) {
	
			/* System.out.println(" Order details : " +request);*/
		      System.out.println("Supplier details : " + supplierrequest);
			
			var supplierresponse = new supplierResponse();
			supplierresponse.setSupplierId(UUID.randomUUID().toString());
			supplierresponse.setMessage("Succesfully created the Suppllier");
			return supplierresponse;
}
}