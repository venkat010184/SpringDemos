package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/*
 * public interface CustomerRepo extends CrudRepository<Customer, Integer> {
 * 
 * }
 */
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
}
