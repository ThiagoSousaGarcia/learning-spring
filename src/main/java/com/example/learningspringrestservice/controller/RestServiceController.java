package com.example.learningspringrestservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.learningspringrestservice.entity.Person;

@RestController
public class RestServiceController {

	private final AtomicLong idCounter = new AtomicLong();
	
	@GetMapping("/person")
	public Person createPerson(@RequestParam(value = "name", defaultValue = "person") String name) {
		return new Person(idCounter.incrementAndGet(),String.format("Hi, I am %s", name));
	}
}
