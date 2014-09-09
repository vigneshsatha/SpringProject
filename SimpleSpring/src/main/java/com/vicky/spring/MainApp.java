package com.vicky.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld hello = (HelloWorld) context.getBean("helloworld");
		//hello.setMessage("Hello Vicky");
		System.out.println(hello.getMessage()+" Your are "+hello.getAge()+" years old");
	}

}
