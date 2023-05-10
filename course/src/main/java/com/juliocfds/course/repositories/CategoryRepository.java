package com.juliocfds.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliocfds.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
