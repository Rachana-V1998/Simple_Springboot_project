package com.example.Q2_springbootsimpleproject_089;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBoot08_09 {
	@GetMapping("/helloworld")
	public String hello()
	{
		System.out.println("hello spring boot");
		return "Simple Spring boot project";
		
	}

}
