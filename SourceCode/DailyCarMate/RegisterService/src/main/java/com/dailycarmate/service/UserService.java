package com.dailycarmate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dailycarmate.model.User;
import com.dailycarmate.repo.UserRepo;

@Service
public class UserService {

	private final UserRepo userRepo;

	public UserService(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	public boolean save(User user)
	{
		
		try{
			userRepo.save(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public List<User> findByName(String name)
	{
		return userRepo.findByName(name);
	}
}
