package com.example.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class UserController {
	
	@Autowired
	private UserService US;
	
	
	/* @GetMapping("/user")
	    public Iterable<User> getUsers() {
	        return US.getUsers();
	    }*/
	 
	 @PostMapping("")
	 public User addUser(User user) {
			return US.addUser(user);		
		}

	 @GetMapping("/sup")
	 public String getUserById(Model model) {
		 
		 Optional<User> user=US.getUserById("3");
		 User user3 =user.get();
		 model.addAttribute("name",user3.getName());
		 model.addAttribute("age",user3.getAge());
		 model.addAttribute("ville",user3.getVille());
		 model.addAttribute("email",user3.getEmail());
		 
		 return "test.html";
		 
	 }
	 

}
