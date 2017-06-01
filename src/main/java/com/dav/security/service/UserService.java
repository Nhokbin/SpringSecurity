package com.dav.security.service;

import com.dav.security.entity.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
