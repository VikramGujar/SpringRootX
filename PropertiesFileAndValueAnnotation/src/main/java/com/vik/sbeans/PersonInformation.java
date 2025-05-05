package com.vik.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personInfo")
public class PersonInformation 
{
	@Value("${person.id}")
	private int id;
	
	@Value("${person.name}")
	private String name;

	@Value("${person.city}")
	private String city;
	
	@Value("${person.age}")
	private int age;

	@Override
	public String toString() {
		return "PersonInformation [Id=" + id + ", Name=" + name + ", City=" + city + ", Age=" + age + "]";
	}
	
	
	
}
