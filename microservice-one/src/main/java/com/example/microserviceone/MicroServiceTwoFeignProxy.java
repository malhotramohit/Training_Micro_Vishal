package com.example.microserviceone;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-two")
@RibbonClient(name = "microservice-two")
public interface MicroServiceTwoFeignProxy {

	@GetMapping("/fromMicro2")
	public String getFromMicroTwo();
}
