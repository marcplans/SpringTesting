package com.spring.testing;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.remoting.rmi.CodebaseAwareObjectInputStream;
import org.springframework.stereotype.Component;

@Component
public class BridalSuite implements Room {

//	Code to be executed after bean creation
	@PostConstruct
	public void postConstructMethod() {
		System.out.println("Executed after bean creation");
	}

//	Code to be executed after spring container turns off
	@PreDestroy
	public void preDestroyMethod() {
		System.out.println("Executed before bean destruction");
	}

//	@Autowired
//	@Qualifier("guestFromCA")
	private Guest newGuest;

//	@Autowired
//	public BridalSuite(@Qualifier("guestFromMA") Guest newGuest) {
//		super();
//		this.newGuest = newGuest;
//	}

//	@Autowired
//	public void setNewGuest(@Qualifier("guestFromNH") Guest newGuest) {
//		this.newGuest = newGuest;
//	}

	@Autowired
	public void anyMethodName(
		@Qualifier("guestFromNY") Guest newGuest) {
		this.newGuest = newGuest;
	}

	@Override
	public String getRoomNumber() {
		return "Bridal Suite room number is 3000";
	}

	@Override
	public String getRoomGuest() {
//		return "Current Bridal Suite guests are Mr. and Mrs. Jones";
		return newGuest.getNewGuest();
	}

}
