package com.sliit.mtit.microservice.productservice.dto;

import java.util.StringJoiner;

public class productRequest {
	private String productName;
	private String productPrice;
	private String productType;
	private String productDetails;
	private String customerName;
	private String customerJobTittle;
	private String supplierName;
	private String supplierAddress;
	
	
	
	
	
	public String getSupplierName() {
		return supplierName;
	}



	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}



	public String getSupplierAddress() {
		return supplierAddress;
	}



	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
	

	public String getProductType() {
		return productType;
	}



	public void setProductType(String productType) {
		this.productType = productType;
	}



	public String getProductDetails() {
		return productDetails;
	}



	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerJobTittle() {
		return customerJobTittle;
	}



	public void setCustomerJobTittle(String customerJobTittle) {
		this.customerJobTittle = customerJobTittle;
	}



	@Override
	public String toString() {
		return "productRequest [productName=" + productName + ", productPrice=" + productPrice + ", productType="
				+ productType + ", productDetails=" + productDetails + ", customerName=" + customerName
				+ ", customerJobTittle=" + customerJobTittle + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + "]";
	}
}
