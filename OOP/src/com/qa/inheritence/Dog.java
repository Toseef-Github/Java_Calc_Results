package com.qa.inheritence;

public class Dog extends Animal {

	private String breed = "pitbull";

	public Dog() {
		super();
	}

	public Dog(boolean fly, int legs) {
		super(fly, legs);
		this.breed = breed;
	}

	@Override
	public void noise() {
		System.out.println("bark");
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", toString()=" + super.toString() + "]";
	}
	
	
	
//	@Override
//	public void food() {
//		System.out.println("dog food");
//		}
}
