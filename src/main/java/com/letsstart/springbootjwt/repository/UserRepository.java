package com.letsstart.springbootjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstart.springbootjwt.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	User findOneByUsername(String username);

}
