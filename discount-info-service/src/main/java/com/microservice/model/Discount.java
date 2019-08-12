package com.microservice.model;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity("Discount_filter")
public class Discount {
	
	private Integer percentage;
	private String session;
	
	
	public Discount() {
		
	}
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	
	

}
