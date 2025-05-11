package com.vik.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class VoterVerification 
{

	@Value("${voter.name}")
	String name;
	@Value("${voter.age}")
	int age = 22;
	@Value("${voter.verifyedBy}")
	String verifyedBy = "Vaibhav";
	LocalDate verifyendOn;
	
	// Get called automatically after object creation
	@PostConstruct
	public void init()
	{
		// Initialize the uninitialized properties 
		verifyendOn = LocalDate.now();
		
		// Check weather properties initialized with correct values 
		if(age<=0 || name==null || verifyedBy==null || verifyendOn==null)
		{
			throw new IllegalArgumentException("Invalid Inputs");
		}
	}
	
	public String verifyVoter()
	{
		if(age>=18)
		{
			return name+" is eleigible for voting"+
			" Verifyed by "+verifyedBy+
			" Verifyed on "+verifyendOn.toString();
		}else
		{
			return name+" is not eleigible for voting"+
					" Verifyed by "+verifyedBy+
					" Verifyed on "+verifyendOn.toString();
		}
	}
	
	// Get called automatically in destruction process [on call of ctx.close() ]
	@PreDestroy
	public void destroy()
	{
		// Nullify all properties 
		name = null;
		age = 0;
		verifyedBy = null;
		verifyendOn = null; 
		
		// Close resources if available
	}
}
