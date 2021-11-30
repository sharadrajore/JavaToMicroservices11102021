package com.zensar.actuators;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id ="my-end")
public class MyCustomEndpoint {
	
	@ReadOperation
	public String myMessage() {
		return "My custom endpoint";
	}

}
