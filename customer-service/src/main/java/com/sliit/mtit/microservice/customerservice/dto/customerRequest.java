package com.sliit.mtit.microservice.customerservice.dto;

import java.util.StringJoiner;

public class customerRequest {
	private String customerName;
	private String age;
	private String customerJobTittle;
	
	
	
	public String getCustomerJobTittle() {
		return customerJobTittle;
	}
	public void setCustomerJobTittle(String customerJobTittle) {
		this.customerJobTittle = customerJobTittle;
	}
	public String getCustomerName() {
		return customerName;
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
	
	@Override
	public String toString() {
		return "customerRequest [customerName=" + customerName + ", age=" + age + ", customerJobTittle="
				+ customerJobTittle + "]";
	}
}
