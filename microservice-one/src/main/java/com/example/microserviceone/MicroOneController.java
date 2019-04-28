package com.example.microserviceone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroOneController {
	
	@Autowired
	private  MicroServiceTwoFeignProxy proxy;
	
	
	@GetMapping("/helloW")
	public String sayHelloWorld() {
		return "Hello,WOlrf";
	
	}
	
	@GetMapping("/helloFeign")
	public String helloFromFeign() {
		return proxy.getFromMicroTwo();
	
	}
	
	

}
