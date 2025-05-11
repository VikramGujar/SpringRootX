package com.vik.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.vik")
@PropertySource("com/vik/commons/info.properties")
public class AppConfig {

}
