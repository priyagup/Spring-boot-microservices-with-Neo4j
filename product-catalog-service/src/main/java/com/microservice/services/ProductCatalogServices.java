package com.microservice.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.model.Discount;
import com.microservice.model.ProductCatalog;
import com.microservice.model.WomenClothing;
import com.microservice.repository.ProductCatalogRepository;

@Service
public class ProductCatalogServices {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ProductCatalogRepository productCatalogRepository;
	
	
	public Collection<ProductCatalog> getAll() {
		// TODO Auto-generated method stub
		
		Discount dis = restTemplate.getForObject("http://discount-info-service/discount/" , Discount.class);
		WomenClothing wo = restTemplate.getForObject("http://product-info-service/shop/women_clothing/All" , WomenClothing.class);
				
		return productCatalogRepository.getAllDiscount(dis, wo);
	}

	
}
