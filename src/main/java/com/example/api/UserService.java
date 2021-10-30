package com.example.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository UR;
	
	public Iterable<User> getUsers() {
		return UR.findAll();
	}
	
	public Optional<User> getUserById(String id) {
		return UR.findById(id);
	}

    
	public User addUser(User u) {
		return UR.save(u);
	}


	 

	
	
	
}
