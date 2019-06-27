package com.spring.testing;

import org.springframework.stereotype.Component;

@Component
public class GuestFromNH implements Guest {

	@Override
	public String getNewGuest() {
		return "Guest from NH are Mr. and Mrs. Brown";
	}

}
