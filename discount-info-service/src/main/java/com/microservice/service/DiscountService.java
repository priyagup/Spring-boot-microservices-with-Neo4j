package com.microservice.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.model.Discount;
import com.microservice.repository.DiscountRepository;
@Service
public class DiscountService {
	
	@Autowired
	DiscountRepository discountRepository;
	
	public Collection<Discount> getAll(String session) {
		// TODO Auto-generated method stub
		return discountRepository.getAllDiscountSession();
	}
	

}
