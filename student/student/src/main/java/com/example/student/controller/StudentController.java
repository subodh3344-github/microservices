package com.example.student.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	/*
	 * @GetMapping("/") public String index() { return
	 * "Greetings from Spring Boot - Student"; }
	 */
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get() {
		System.out.println("In test");
		return "Get Returned";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create() {
		System.out.println("In create");
		return "Create Returned";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update() {
		System.out.println("In update");
		return "Update Returned";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String test() {
		System.out.println("In delete");
		return "Delete Returned";
	}
	
}
