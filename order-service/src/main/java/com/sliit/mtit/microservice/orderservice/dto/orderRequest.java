package com.sliit.mtit.microservice.orderservice.dto;

import java.util.StringJoiner;

public class orderRequest {
	private String fullName;
	private String age;
	private String orderType;
	private String orderdetails;
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}
	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	/**
	 * @return the orderdetails
	 */
	public String getOrderdetails() {
		return orderdetails;
	}
	/**
	 * @param orderdetails the orderdetails to set
	 */
	public void setOrderdetails(String orderdetails) {
		this.orderdetails = orderdetails;
		
	}
	/*
	@Override
	public String toString() {
		return "orderRequest [fullName=" + fullName + ", age=" + age + ", orderType=" + orderType + ", orderdetails="
				+ orderdetails + "]";
	}
	*/
	@Override
	public String toString() {
	
		
		  return "orderRequest{" +
          "fullName=" + fullName +
          ", age='" + age + '\'' +
          ", orderType=" + orderType +
          ", orderdetails='" + orderdetails + '\'' +
          '}';
	}
	
	
	
}
