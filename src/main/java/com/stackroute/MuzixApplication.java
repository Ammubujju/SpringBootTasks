package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
@PropertySource("application.properties")
public class MuzixApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(MuzixApplication.class, args);

	}

}
