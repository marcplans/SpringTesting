package com.spring.testing;

public class ExecutiveSuite implements Room {

	@Override
	public String getRoomNumber() {
		return "Presidential Suite room number is 4000";
	}

	@Override
	public String getRoomGuest() {
		return "Current Presidential Suite guest is Mr. Smith";
//		return newGuest.getNewGuest();
	}

}
