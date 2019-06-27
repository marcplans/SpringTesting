package com.spring.testing;

import org.springframework.stereotype.Component;

@Component
public class GuestFromMA implements Guest {
	
	@Override
	public String getNewGuest() {
		// TODO Auto-generated method stub
		return "New guest from MA is Mr. Thompson";
	}

}
