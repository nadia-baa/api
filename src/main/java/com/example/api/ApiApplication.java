package com.example.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	@Autowired
	private UserService US;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("hey");
		
		//show existing users 
		Iterable<User> users = US.getUsers();

		users.forEach(user -> System.out.println(user.getName()+"....."+user.getAge()+"....."+user.getVille()+"....."+user.getEmail()));
		
		
		
		
		Optional<User> user= US.getUserById("1");
		User user1 = user.get();
		
		System.out.println(user1.getName());	
		
		user1.getRoles().forEach(
				role -> System.out.println(role.getName()));
		 
		
		//add a new user
		//User user1 = new User();
		/*user1.setId("3");
		user1.setName("user3");
		user1.setAge(20);
		user1.setVille("");
		user1.setEmail("user2@gmail.com");
		user1.setPassword("098765");
		
		User u = new User();
		u=US.addUser(user1);
		
		users = US.getUsers();*/
		
		//System.out.println("------------la liste des users apres l'ajout---------------");

		//users.forEach(user -> System.out.println(user.getName()+"....."+user.getAge()+"....."+user.getVille()+"....."+user.getEmail()));
		 
		
	}
	
	
	
	

}
