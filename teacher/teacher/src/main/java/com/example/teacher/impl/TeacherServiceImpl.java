package com.example.teacher.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.teacher.service.TeacherServices;

public class TeacherServiceImpl implements TeacherServices {

	@Override
	public String fetchStudentService() {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("Calling students services");
		ResponseEntity<String> response = restTemplate
				.getForEntity("http://zavrnbw10s0087.corp.dsarena.com:2222/student/get", String.class);
		System.out.println("Got response **** " + response.getBody().toString());
		return null;
	}

}
