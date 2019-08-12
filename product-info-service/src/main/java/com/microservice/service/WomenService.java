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

	public Collection<WomenClothing> getAll() {
		// TODO Auto-generated method stub
		return womenRepository.getAllClothing();
	}


}
