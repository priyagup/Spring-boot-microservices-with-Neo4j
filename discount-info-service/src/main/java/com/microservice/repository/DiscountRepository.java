package com.microservice.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.microservice.model.Discount;
@Repository
public interface DiscountRepository extends Neo4jRepository<Discount, Long> {

	@Query("MATCH (n:Discount_filter) return n ")
	Collection<Discount> getAllDiscountSession();

}
