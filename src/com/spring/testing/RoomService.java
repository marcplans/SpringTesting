package com.spring.testing;

import org.springframework.stereotype.Component;

@Component
public class RoomService {
	
	public String getPrice() {
		return "Room service price is 100$";
	}
	
	public String getOrder() {
		return "Order is continental breakfast";
	}

}
