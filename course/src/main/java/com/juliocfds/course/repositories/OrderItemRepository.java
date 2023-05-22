package com.juliocfds.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliocfds.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
