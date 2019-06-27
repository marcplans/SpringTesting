package com.spring.testing;

import org.springframework.stereotype.Component;

@Component
public class GuestFromCA implements Guest {

	@Override
	public String getNewGuest() {
		return "Guest from CA are Mr. and Mrs. Fernadez";
	}

}
