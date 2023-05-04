package com.juliocfds.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliocfds.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
