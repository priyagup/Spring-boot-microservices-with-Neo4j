package com.microservice.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.WomenClothing;
import com.microservice.service.WomenService;

@RestController
@RequestMapping("/shop")
public class WomenResource {
	@Autowired
	WomenClothing womenClothing;

	@Autowired
	WomenService womenService;
	
	@GetMapping("/women_clothing/{type}")
	public Collection<WomenClothing> getAll(@PathVariable("type") String type){
		return womenService.getAll(type);
	}
	
}
