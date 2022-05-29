package com.qa.inheritence;

public class Runner {

	public static void main(String[] args) {
		
		Cat cat = new Cat(false, 4, "grey", 6);
		cat.noise();
		cat.food();
		System.out.println(cat);
		
		Dog dog = new Dog();
		dog.noise();
		dog.food();

	}

	}



