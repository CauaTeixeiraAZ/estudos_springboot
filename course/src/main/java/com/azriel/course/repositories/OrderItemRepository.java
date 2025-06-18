package com.azriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azriel.course.entities.OrderItem;
import com.azriel.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}