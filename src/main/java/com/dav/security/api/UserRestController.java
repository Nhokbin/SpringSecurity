package com.dav.security.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dav.security.entity.User;
import com.dav.security.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public @ResponseBody String getUsers() {
		return "{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Feynman\"},"
				+ "{\"firstname\":\"Marie\",\"lastname\":\"Curie\"}]}";
	}
}
