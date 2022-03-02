package com.ibs.springbootmicroservice.api.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/tripsServiceFallBack")
    public String tripsServiceFallBackMethod() {
        return "Trips Service is taking longer than Expected." +
                " Please try again later";
    }

}
