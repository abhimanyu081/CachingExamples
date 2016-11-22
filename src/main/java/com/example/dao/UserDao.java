package com.example.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.model.User;

@Transactional
@Component
public interface UserDao extends CrudRepository<User,Long>{
	
	public User findByEmail(String email);

}
