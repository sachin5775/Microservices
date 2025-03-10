package com.user.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	List<User> users = List.of(new User(111L, "Sachin Patil", 6786834645645L),
			new User(235345L, "Sujit Patil", 45647575L),new User(112L, "Sujit Patil", 45647575L), new User(2534623L, "Divya Patil", 34543645745L));
	Logger logger = Logger.getLogger(UserServiceImpl.class.getName());
	@Override
	public User getUser(Long id) {
		String name = users.getClass().getName();
		logger.info(name);
		return users.stream().filter(u -> u.getUserid().equals(id)).findAny().orElse(null);
	}

}
