package com.example.api;

import java.lang.reflect.Member;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {
	
	@Autowired
	private UserService US;
	
	
	 @GetMapping("/user")
	    public Optional<User> getUserById(String id) {
	        return US.getUserById(id);
	    }
	 
	 @PostMapping("")
	 public User addUser(User user) {
			return US.addUser(user);		
		}


}
