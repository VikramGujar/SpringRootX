package com.vik.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personInfo")
public class PersonInformation 
{
	// Injecting values from properties file via @Value annotation
	@Value("${person.id}")
	private int id;
	
	@Value("${person.name}")
	private String name;

	@Value("${person.city}")
	private String city;
	
	@Value("${person.age}")
	private int age;
	
	// Inject direct value via @Value annotation 
	@Value("vikramgujar300@gmail.com")
	private String email;

	@Override
	public String toString() {
		return "PersonInformation [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", email=" + email
				+ "]";
	}

	
	
	
	
}
