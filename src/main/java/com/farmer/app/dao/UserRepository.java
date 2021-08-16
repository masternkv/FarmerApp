package com.farmer.app.dao;

import com.farmer.app.model.User;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>
{
	User findByUsername(String username);
	
}
