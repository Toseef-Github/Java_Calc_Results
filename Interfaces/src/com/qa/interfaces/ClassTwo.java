package com.qa.interfaces;

public class ClassTwo implements Car, Animal {

	@Override
	public void sound() {
		System.out.println("The sound a dog makes is woof");
		
	}

	@Override
	public void sleep() {
		System.out.println("All animals sleep");
		
	}

	@Override
	public void horsepower() {
		System.out.println("What is your cars horsepower");
		
	}

	@Override
	public void model() {
		System.out.println("What is your cars model");
		
	}

}
