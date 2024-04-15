package com.contact.entity;

import lombok.Data;

@Data
public class Contact {
	private long cid;
	private String email;
	private String contactName;
	private Long uid;

	public Contact(long cid, String email, String contactName, long uid) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactName = contactName;
		this.uid = uid;
	}

	public Contact() {
		super();
	}
}
