package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Student;

public class Test {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Student s = (Student) ac.getBean("s");
		s.display();
	}

}
