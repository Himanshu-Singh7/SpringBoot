package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entites.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(BootjpaexampleApplication.class, args);
	UserRepository userreposeitory = context.getBean(UserRepository.class);
	User user = new User();
	
	user.setName("Himanshu");
	user.setCity("Varansi");
	user.setStatus("I am java programmer");
	
	User user1 = userreposeitory.save(user);
	System.out.println(user1);
	
	
	}

}
