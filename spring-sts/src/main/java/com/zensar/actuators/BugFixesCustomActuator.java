package com.zensar.actuators;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id ="bug-fixes")
public class BugFixesCustomActuator {
	
	private Map<String,List<String>> bugFixesByVersionMap=new HashMap<>();
	
	@PostConstruct
	public void init() {
		bugFixesByVersionMap.put("v1",Arrays.asList("Invalid issue","App Not Working"));
		
		bugFixesByVersionMap.put("v2",Arrays.asList("Throwing exception","Write Proper code "));
	}
	
	//http://localhost:8080/student-app/my-actuator/bug-fixes/
	@ReadOperation
	public Map<String,List<String>> getAllBugs() {
		return bugFixesByVersionMap;
	}
	//http://localhost:8080/student-app/my-actuator/bug-fixes/v2   
	@ReadOperation  
	public List<String> getBugFixByVersion(@Selector String version) {
		return bugFixesByVersionMap.get(version);
	}
	
	@WriteOperation
	public void addBugFixes(@Selector String version,String bugfixes) {
		System.out.println("Hiiiiiiiiiiiiiii");
		bugFixesByVersionMap.put(version,Arrays.asList(bugfixes.split(",")) );
	}
	
	
	
	

}
