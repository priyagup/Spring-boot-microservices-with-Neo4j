package com.microservice.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.Discount;
import com.microservice.service.DiscountService;



@RestController
@RequestMapping("/discount")
public class DiscountResource {
	
	@Autowired
	Discount discount;

	@Autowired
	DiscountService discountService;
	
	@GetMapping("/{session}")
	public Collection<Discount> getAll(@PathVariable("session") String session){
		return discountService.getAll(session);
	}
	
}
