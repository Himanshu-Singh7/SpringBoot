package com.jpa.test;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entites.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userreposeitory = context.getBean(UserRepository.class);

//	User user = new User();
//	user.setName("Himanshu");
//	user.setCity("Varansi");
//	user.setStatus("I am java programmer");
//	User user1 = userreposeitory.save(user);
//	System.out.println(user1);

    //      Create Object of User
//		User user1 = new User();
//		user1.setName("Rahul Singh");
//		user1.setCity("Chandauli");
//		user1.setStatus("Python Pragrammer");
//
//		User user2 = new User();
//		user2.setName("Aprajit Singh");
//		user2.setCity("Patana");
//		user2.setStatus("Salesforce developer");

		// Saving single user
//		User resultuser = userreposeitory.save(user2);
//		// saving multilple data
//		List<User> users = List.of(user1, user2);
//		Iterable<User> result = userreposeitory.saveAll(users);
//		for (User user : result) {
//			System.out.println(user);
//		}

//	    System.out.println("save user"+resultuser);
//		System.out.println("Done");

		// Update the user of id 2
		
//		Optional<User> optional = userreposeitory.findById(2);
//		User user = optional.get();
//		user.setName("Rahul singh Chandel");
//		User result1 = userreposeitory.save(user);
//		System.out.println(result1);
		
		
		//How to get data
		//FindById() -> return optional contaning data
		
//		Iterable<User> itr = userreposeitory.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}

//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				System.out.println(t);	
//			}
//		});
//		
		
//		itr.forEach(user->{System.out.println(user);});
		
		//Deleting the user element
//		userreposeitory.deleteById(1);
//		System.out.println("deleted");
		Iterable<User> alluser = userreposeitory.findAll();
		alluser.forEach(user ->{System.out.println(user);});
		userreposeitory.deleteAll(alluser);
		
	}

}
