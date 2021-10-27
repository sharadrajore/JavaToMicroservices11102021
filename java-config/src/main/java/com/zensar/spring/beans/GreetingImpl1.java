package com.zensar.spring.beans;

public class GreetingImpl1 implements Greeting {

	@Override
	public String sayHello(String name) {
		System.out.println("Inside public String sayHello(String name) ");
		return "GreetingImpl1 says hello to "+name;
	}

}
