package com.microservice.model;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCatalog {
	
	private String name; 
	private String discounted_price;
	private String session;
	private Integer percentage;
	
	public ProductCatalog() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscounted_price() {
		return discounted_price;
	}
	public void setDiscounted_price(String discounted_price) {
		this.discounted_price = discounted_price;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	
}
