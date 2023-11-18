package com.example.teacher.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.teacher.impl.TeacherServiceImpl;
import com.example.teacher.service.TeacherServices;

@Configuration

public class TeacherConf {

	@Bean
    public TeacherServices accountsService() {
        return new TeacherServiceImpl();
    }
}
