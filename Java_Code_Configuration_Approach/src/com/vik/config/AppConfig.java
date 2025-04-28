package com.vik.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.vik.beans")
public class AppConfig 
{
	@Bean(name="ldate")
	public LocalDate createLocalDate()
	{
		return LocalDate.now();
	}
}
