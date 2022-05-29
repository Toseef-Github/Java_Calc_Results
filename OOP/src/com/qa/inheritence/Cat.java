package com.qa.inheritence;

public class Cat extends Animal{

	private String colour;
	private int age;
	
	public Cat() {
		super();
		
	}
	public Cat(boolean fly, int legs, String colour, int age) {
		super(fly, legs);
		this.colour = colour;
		this.age = age;
		
	}
	
	@Override
	public void noise() {
		System.out.println("meow");
	}
	
	@Override
	public void food() {
		System.out.println("cat food");
		}
	@Override
	public String toString() {
		return "Cat [colour=" + colour + ", age=" + age + ", toString()=" + super.toString() + "]";
	}
	
	

	}

