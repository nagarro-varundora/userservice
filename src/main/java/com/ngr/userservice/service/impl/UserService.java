package com.ngr.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngr.userservice.model.dao.User;
import com.ngr.userservice.model.dto.UserDetails;
import com.ngr.userservice.repository.UserRepository;
import com.ngr.userservice.service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public UserDetails getUserById(int id) {
		User user = userRepo.findById(id).get();
		UserDetails userDetails = new UserDetails(user.getName(), user.getEmail(), user.getAge());
//		UserDetails userDetails = new UserDetails("Sample", "sample@sample.com", 100);
		return userDetails;
	}

}
