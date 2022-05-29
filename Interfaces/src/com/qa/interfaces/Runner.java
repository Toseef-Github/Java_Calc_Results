package com.qa.interfaces;

public class Runner {

	public static void main(String[] args) {
		ClassOne classOne = new ClassOne();
		classOne.football();
		classOne.tennis();
		classOne.horsepower();
		classOne.model();
		
//		classOne.tester; - How do you run strings
		
		ClassTwo cTwo = new ClassTwo();
		cTwo.sound();
		cTwo.sleep();
		cTwo.horsepower();
		cTwo.model();
		
		

	}

}
