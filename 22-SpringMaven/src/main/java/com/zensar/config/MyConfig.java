package com.zensar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zensar.bean.Circle;
import com.zensar.bean.ExamMark;
import com.zensar.bean.Student;

@Configuration
public class MyConfig {
	@Bean(name = "cbean")
	public Circle f1() {
		return new Circle();

	}
	
	@Bean(name="sbean")
	public Student f2() {
		return new Student();
		
	}
	
	@Bean(name="ebean")
	public ExamMark f3() {
		return new ExamMark();
	}
}
