package com.example.FirstProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.FirstProject.model.User;

@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Integer> {

}
