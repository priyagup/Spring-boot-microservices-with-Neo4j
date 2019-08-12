package com.microservice.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.microservice.model.Discount;
import com.microservice.model.ProductCatalog;
import com.microservice.model.WomenClothing;

@Repository

public interface ProductCatalogRepository extends Neo4jRepository<ProductCatalog, Long> {

	@Query("MATCH (w:wo)-[d.Discounted]->(f:dis) return w,d,f")
	Collection<ProductCatalog> getAllDiscount(Discount dis, WomenClothing wo);

	
}
