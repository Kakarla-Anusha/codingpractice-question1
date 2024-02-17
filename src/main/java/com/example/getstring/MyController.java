package com.example.getstring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class MyController {
@GetMapping("/") 
public String getname() {
	return "Welocme to Spring Boot";
}

	
	

}
