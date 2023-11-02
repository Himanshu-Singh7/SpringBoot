package com.jpa.test.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entites.User;
import java.util.List;
public interface UserRepository extends CrudRepository<User, Integer>{
 
	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name , String City);
	//Using JPQL Query
	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	@Query("select u FROM User u WHERE u.name= :n")
	public List<User> getUserByName(@Param("n")String name);
	//Native Query
	@Query(value = "select * FROM User" , nativeQuery = true)
	public List<User> getUser();
	
	
}
