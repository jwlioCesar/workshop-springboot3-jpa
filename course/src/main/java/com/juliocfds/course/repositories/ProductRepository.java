package com.juliocfds.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliocfds.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
