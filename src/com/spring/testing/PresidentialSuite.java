package com.spring.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PresidentialSuite implements Room {
	
//	@Autowired
//	@Qualifier("guestFromNY")
//	private Guest newGuest;


//	@Autowired
//	public PresidentialSuite(Guest newGuest,
//		GuestAddress guestAddress) {
//		// injects newGuest
//		super();
//		this.newGuest = newGuest;
//		this.guestAddress = guestAddress;
//	}

	@Override
	public String getRoomNumber() {
		return "Presidential Suite room number is 2000";
	}

	@Override
	public String getRoomGuest() {
		return "Current Presidential Suite guest is Mr. Smith";
//		return newGuest.getNewGuest();
	}



}
