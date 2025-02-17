package com.verizon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.verizon.entity.Users;

@Repository
public interface UserRepo extends MongoRepository<Users,Integer> {

	public Users findByUsername(String username);
	

}
