package com.zensar.spring.beans;

public class GreetingImpl2 implements Greeting {

	@Override
	public String sayHello(String name) {
		System.out.println("Inside public String sayHello(String name) ");
		return "GreetingImpl2 says hi to "+name;
	}

}
