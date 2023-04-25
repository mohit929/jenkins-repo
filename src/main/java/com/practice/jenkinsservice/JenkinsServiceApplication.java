package com.practice.jenkinsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsServiceApplication.class, args);
		System.out.println("Hi I am jenkins application");
	}

	@GetMapping("/deploy")
	public String deploy()
	{
		return "Deploying with jenkins on external tomcat is done";
	}

}
