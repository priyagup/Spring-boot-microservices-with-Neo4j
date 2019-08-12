package com.microservice.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.microservice.model.WomenClothing;

public interface WomenRepository extends Neo4jRepository<WomenClothing, Long> {

	@Query("MATCH (n:Women_Clothing) RETURN n")
	Collection<WomenClothing> getAllClothing();

}
