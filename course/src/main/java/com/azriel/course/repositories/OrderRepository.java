package com.azriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azriel.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
