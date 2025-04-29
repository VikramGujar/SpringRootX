package com.vik.cnfig;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.vik.beans")
public class AppConfig 
{
	@Bean(name="ltime")
	public LocalTime createLocalTime()
	{
		return LocalTime.now();
	}
}
