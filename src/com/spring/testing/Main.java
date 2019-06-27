package com.spring.testing;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(MyConfig.class);
		
//		Room myRoom1 = myContext.getBean("presidentialSuite", Room.class);
//		Room myRoom2 = myContext.getBean("bridalSuite", Room.class);
		
		Room myRoom1 = myContext.getBean(PresidentialSuite.class);
		System.out.println(myRoom1.getRoomNumber());
		System.out.println(myRoom1.getRoomGuest());
		System.out.println();
		
		Room myRoom2 = myContext.getBean(BridalSuite.class);
		System.out.println(myRoom2.getRoomNumber());
		System.out.println(myRoom2.getRoomGuest());
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println();
//		
//		System.out.println(((PresidentialSuite) myRoom1).getNewGuests());
//		System.out.println(((PresidentialSuite) myRoom1).getGuestAddress());
//		
//		RoomService myRoomService = myContext.getBean(RoomService.class);
//		
//		System.out.println();
//		System.out.println(myRoomService.getOrder());
//		System.out.println(myRoomService.getPrice());
//		
//		System.out.println();
		
//		System.out.println(((BridalSuite) myRoom2).bridalNewGuests);

		
		
		
		
		
		
		
		
		
		
		myContext.close();
	}

	

	


}
