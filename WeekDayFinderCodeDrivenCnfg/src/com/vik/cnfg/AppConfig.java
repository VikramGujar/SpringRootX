package com.vik.cnfg;


import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration // Component++
@ComponentScan(basePackages ="com.vik.sbeans")
public class AppConfig 
{

	public AppConfig()
	{
		System.out.println("AppConfig:: Constructor");
	}
	
	@Bean("ldate")
	public LocalDate createDate()
	{
		return LocalDate.now();
	}
}
