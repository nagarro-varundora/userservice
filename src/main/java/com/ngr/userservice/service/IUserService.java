package com.ngr.userservice.service;

import com.ngr.userservice.model.dto.UserDetails;

public interface IUserService {
	
	UserDetails getUserById(int id);

}
