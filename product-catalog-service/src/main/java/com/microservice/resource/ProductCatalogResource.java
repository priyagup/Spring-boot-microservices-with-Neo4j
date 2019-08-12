package com.microservice.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.model.ProductCatalog;
import com.microservice.services.ProductCatalogServices;

@RestController
@RequestMapping("/catalog")
public class ProductCatalogResource {

	
	
	@Autowired
	private ProductCatalogServices productCatalogServices;
	
	@GetMapping
	public Collection<ProductCatalog> getCatalog(){
		
		
		return productCatalogServices.getAll();
	}

}
