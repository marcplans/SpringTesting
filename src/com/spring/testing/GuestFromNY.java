package com.spring.testing;

import org.springframework.stereotype.Component;

@Component
public class GuestFromNY implements Guest {

	@Override
	public String getNewGuest() {
		return "Guest from NY is Ms. White";
	}

}
