package com.spring.testing;

import org.springframework.stereotype.Component;

@Component
public class PresidentialSuite implements Room {

	@Override
	public String getRoomNumber() {
		return "Presidential Suite room number is 2000";
	}

	@Override
	public String getRoomGuests() {
		return "Current Presidential Suite guest is Mr. Trump";
	}

}
