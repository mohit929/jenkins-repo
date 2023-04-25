package com.practice.jenkinsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsServiceApplication.class, args);
		System.out.println("Hi I am jenkins application");
		System.out.println("Hello I am mohit suryawanshi")
	}

}
