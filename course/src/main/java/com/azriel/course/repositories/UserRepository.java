package com.azriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azriel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
