package com.example.teacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.teacher.service.TeacherServices;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	TeacherServices service;
	
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
	
	@RequestMapping(value = "/get/student", method = RequestMethod.GET)
	public String getStudents() {
		System.out.println("In getStudents");
		service.fetchStudentService();
		return "Get student Returned";
	}
	
}
