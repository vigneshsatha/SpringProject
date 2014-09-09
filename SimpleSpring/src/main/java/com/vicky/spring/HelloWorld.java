package com.vicky.spring;

public class HelloWorld {
	private String message;
	private int age;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public HelloWorld(String message, int age) {
		this.message = message;
		this.age = age;
	}
	public HelloWorld(String message) {
		this.message = message;
	}
	public HelloWorld(int age) {
		this.age = age;
	}

}
