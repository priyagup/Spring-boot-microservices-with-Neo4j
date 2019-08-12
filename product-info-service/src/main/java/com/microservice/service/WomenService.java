package com.microservice.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.model.WomenClothing;
import com.microservice.repository.WomenRepository;

@Service
public class WomenService {
	
	@Autowired
	WomenRepository womenRepository;

	public Collection<WomenClothing> getAll(String type) {
		// TODO Auto-generated method stub
		
		  if(type.compareTo("Dress") ==0) { return womenRepository.getAllDress(); } else
		  if(type.compareTo("Jeans") ==0) { return womenRepository.getAllJeans(); } else
		  if(type.compareTo("All") ==0) {
		 
			return womenRepository.getAllDress();
		}
		return null;
		
	}


}
