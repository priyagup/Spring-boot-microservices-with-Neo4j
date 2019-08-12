package com.microservice.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.microservice.model.ProductCatalog;

public interface ProductCatalogRepository extends Neo4jRepository<ProductCatalog, Long> {

}
