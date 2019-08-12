package com.microservice.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.microservice.model.WomenClothing;

@Repository
public interface WomenRepository extends Neo4jRepository<WomenClothing, Long> {

	@Query("MATCH (n:Women_Clothing) RETURN n")
	Collection<WomenClothing> getAllClothing();
	
	@Query("MATCH (n:Women_Clothing) where n.type='Dress' RETURN n")
	Collection<WomenClothing> getAllDress();
	
	@Query("MATCH (n:Women_Clothing) where n.type='Jeans' RETURN n")
	Collection<WomenClothing> getAllJeans();

}
