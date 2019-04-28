package com.example.microservicetwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroTwoController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/fromMicro2")
	public String getFromMicroTwo() {
		return "I am from micro 2 "+env.getProperty("server.port");
	}

}
