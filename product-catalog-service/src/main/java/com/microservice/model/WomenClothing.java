package com.microservice.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.stereotype.Component;

@NodeEntity("Women_Clothing")
@Component
public class WomenClothing {
	
	@Id
	private Long id;
	private String name;
	private String price;
	private String type;

	public WomenClothing(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}