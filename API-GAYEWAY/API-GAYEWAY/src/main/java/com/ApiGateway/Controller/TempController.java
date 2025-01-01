package com.ApiGateway.Controller;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiGateway.Entity.Users;
import com.ApiGateway.Repository.BookClientRepository;
import com.ApiGateway.Service.SecurityService;
import com.ApiGateway.Service.UserService;

import jakarta.websocket.server.PathParam;

@RestController
public class TempController {
	
	
	@GetMapping("/test")
	public ResponseEntity<?> temp() {
		return ResponseEntity.ok("This is a testing page");
	}
	
	@GetMapping("/public/**")
	public ResponseEntity<?> getMethodName() {
		List<Integer> l = List.of(1,2,3);
		return ResponseEntity.ok(l);
	}
	
	

}
