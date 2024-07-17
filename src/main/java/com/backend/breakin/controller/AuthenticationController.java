package com.backend.breakin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.breakin.service.AuthenticationService;
import com.backend.breakin.user.User;

@RestController
public class AuthenticationController {
	
	private AuthenticationService authService;
	   @Autowired
	    public AuthenticationController(AuthenticationService authService) {
	        this.authService = authService;
	    }
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User user){
		return ResponseEntity.ok(authService.register(user));
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user){
		return ResponseEntity.ok(authService.authenticate(user));
	}

}
