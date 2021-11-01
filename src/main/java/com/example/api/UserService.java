package com.example.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event.ID;

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


	 public void supprimerUserById(String id) {
		 UR.deleteById(id);
	 }

	
	
	
}
