package com.juliocfds.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliocfds.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
