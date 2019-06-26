package com.spring.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PresidentialSuite implements Room {

	private Guest newGuest;
	private GuestAddress guestAddress;

	@Autowired
	public PresidentialSuite(Guest newGuest,
		GuestAddress guestAddress) {
		// injects newGuest
		super();
		this.newGuest = newGuest;
		this.guestAddress = guestAddress;
	}

	@Override
	public String getRoomNumber() {
		return "Presidential Suite room number is 2000";
	}

	@Override
	public String getRoomGuests() {
		return "Current Presidential Suite guest is Mr. Smith";
	}

	// returns newGuest injection
	public String getNewGuests() {
		return newGuest.getGuest();
	}

	// returns guestAddress injection
	public String getGuestAddress() {
		return guestAddress.getAddress();
	}

}
