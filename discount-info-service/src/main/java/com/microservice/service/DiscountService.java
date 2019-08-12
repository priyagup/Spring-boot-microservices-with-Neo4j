package com.microservice.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.model.Discount;
import com.microservice.repository.DiscountRepository;

public class DiscountService {
	
	@Autowired
	DiscountRepository discountRepository;
	
	public Collection<Discount> getAll() {
		// TODO Auto-generated method stub
		return discountRepository.getAllDiscountSession();
	}
	

}
