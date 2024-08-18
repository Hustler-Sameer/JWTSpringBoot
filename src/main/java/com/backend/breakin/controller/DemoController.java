package com.backend.breakin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
	
	@GetMapping("/breakin/ganpatiBappaMorya")
	public ResponseEntity<?> demo(){
		return ResponseEntity.ok("Ganpati Bappa Morya");
	}

}
