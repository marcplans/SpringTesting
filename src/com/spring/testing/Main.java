package com.spring.testing;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Room myRoom = myContext.getBean("presidentialSuite", Room.class);
		
		System.out.println(myRoom.getRoomNumber());
		System.out.println(myRoom.getRoomGuests());
		
		RoomService myRoomService = myContext.getBean(RoomService.class);
		
		System.out.println();
		System.out.println(myRoomService.getOrder());
		System.out.println(myRoomService.getPrice());
		
		
		
		
		
		
		
		
		
		
		
		
		myContext.close();
	}

	

	


}
