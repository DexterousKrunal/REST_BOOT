package io.krunal.springRest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import io.krunal.springRest.entity.Users;

public interface UserRepository extends Repository <Users,String> {
	//public List<Users> findAll();
	public Users findOne(String id);
	public List<Users> findAll();
	
	public Users save(Users user);
	public void delete(Users user);
	
	
	
}
