package com.practice.jenkinsservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsServiceApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertEquals(true,true);
		System.out.println("Test got executed");
	}

}
