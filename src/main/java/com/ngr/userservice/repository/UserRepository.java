package com.ngr.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ngr.userservice.model.dao.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	

}
