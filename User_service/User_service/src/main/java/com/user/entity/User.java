package com.user.entity;

import java.util.List;

import lombok.Data;

@Data
public class User {
	private Long userid;
	private String name;
	private Long phone;
	private List<Contact> contacts;

	public User(long userid, String name, long phone, List<Contact> contacts) {
		super();
		this.userid = userid;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

	public User(long userid, String name, long phone) {
		super();
		this.userid = userid;
		this.name = name;
		this.phone = phone;
	}

	public User() {
		super();
	}

}
