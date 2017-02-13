package com.dailycarmate.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycarmate.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
	List<User> findByName(String name); 
}
