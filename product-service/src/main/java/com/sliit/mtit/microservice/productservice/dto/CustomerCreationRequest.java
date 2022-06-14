package com.sliit.mtit.microservice.productservice.dto;

public class CustomerCreationRequest {
	private String customerName;
	private String customerJobTittle;
	private String age;
	
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerJobTittle() {
		return customerJobTittle;
	}
	public void setCustomerJobTittle(String customerJobTittle) {
		this.customerJobTittle = customerJobTittle;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	
	

}
