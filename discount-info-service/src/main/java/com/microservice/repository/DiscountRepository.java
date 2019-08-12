package com.microservice.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.microservice.model.Discount;

public interface DiscountRepository extends Neo4jRepository<Discount, Long> {

	@Query("MATCH (n:Discount_filter) return n ")
	Collection<Discount> getAllDiscountSession();

}
