package com.spring.testing;

import org.springframework.stereotype.Component;

@Component
public class NewGuest implements Guest {

	@Override
	public String getGuest() {
		// TODO Auto-generated method stub
		return "New guest for Presidential Suite is Mr. Thompson";
	}

}
