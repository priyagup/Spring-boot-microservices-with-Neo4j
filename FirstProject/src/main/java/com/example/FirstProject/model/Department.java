package com.example.FirstProject.model;

public class Department { //POJO
	
	private String name;
	private String groupID;
	
	public Department(String name, String groupID) {
		super();
		this.name = name;
		this.groupID = groupID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroupID() {
		return groupID;
	}
	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}
	
	
	

}
