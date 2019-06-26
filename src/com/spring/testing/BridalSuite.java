package com.spring.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BridalSuite implements Room{
	
	@Autowired
	@Qualifier("guestFromNY")
	public Guest bridalNewGuests;
	

	@Override
	public String getRoomNumber() {
		return "Bridal Suite room number is 3000";
	}

	@Override
	public String getRoomGuests() {
		return "Current Bridal Suite guests are Mr. and Mrs. Jones";
	}





	
	
	

}
