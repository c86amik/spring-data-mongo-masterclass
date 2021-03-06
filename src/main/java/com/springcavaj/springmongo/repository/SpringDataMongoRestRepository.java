/**
 * 
 */
package com.springcavaj.springmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springcavaj.springmongo.model.User;

/**
 * @author springcavaj
 *
 */
@Repository
public interface SpringDataMongoRestRepository extends MongoRepository<User, String>{
	
	public List<User> findByFirstName(String firstName);
	
	public List<User> findByLastName(String lastName);
	
	public User findByMobileNo(String mobileNo);
	
	public User findByEmail(String email);
	
	public User findByPanNo(String panNo);
	
	@Query("{$and: [{firstName: ?0}, {lastName: ?1}]}")
	public User findByFirstAndLastName(String firstName, String lastName);
}
