package com.Crud.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Crud.project.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
		

}
