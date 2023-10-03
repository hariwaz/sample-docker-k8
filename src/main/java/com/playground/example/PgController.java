package com.playground.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PgController {

	@GetMapping("/greetings")
	public String greet() {
		return "Greetings from Spring Boot! This exercise Objective is to run from K8s";
	}
	
	@GetMapping(value= "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> getProducts() {
		List<String> list = new ArrayList<>();
		list.add("Loan");
		list.add("Serviceing");
		list.add("Securitization");
		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
	}
}
