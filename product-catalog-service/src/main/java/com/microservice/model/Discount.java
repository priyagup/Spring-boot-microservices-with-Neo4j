package com.microservice.model;

import java.util.List;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.stereotype.Component;

@Component
@NodeEntity("Discount_filter")
public class Discount {
	
	@Id
	private Long id;
	private Integer percentage;
	private String session;
	
	@Relationship(type="DISCOUNTED", direction = Relationship.INCOMING)
	private List<WomenClothing> womenClothing;
	
	
	
	public List<WomenClothing> getWomenClothing() {
		return womenClothing;
	}

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