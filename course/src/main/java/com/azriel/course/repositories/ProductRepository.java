package com.azriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azriel.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
