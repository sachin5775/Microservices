package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/{uid}")
	public User getUser(@PathVariable("uid") Long uid) {
		User user = userService.getUser(uid);
		// List contacts =
		// restTemplate.getForObject("http://localhost:9091/contact/user/" + uid,
		// List.class);
		List contacts = restTemplate.getForObject("http://contact-service/contact/user/" + uid, List.class);
		user.setContacts(contacts);
		return user;
	}
}
