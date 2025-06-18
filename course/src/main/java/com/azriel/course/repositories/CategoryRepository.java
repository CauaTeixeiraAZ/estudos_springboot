package com.azriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azriel.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
