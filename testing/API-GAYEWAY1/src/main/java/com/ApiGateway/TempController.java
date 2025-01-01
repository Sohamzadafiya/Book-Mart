package com.ApiGateway;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class TempController {
	
	
	@GetMapping("/test")
	public String temp() {
		return "This is a testing page";
	}
	
	@GetMapping("/public")
	public String getMethodName() {
		return "This is a public page";
	}
	

}
