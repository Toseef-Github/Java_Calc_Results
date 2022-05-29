package com.qa.objectorientedprogramming;

public class runnerCar {

	public static void main(String[] args) {
		
		car myCar = new car();
		System.out.println(myCar);
		
		car carOne = new car("Blue", 150, true, "Audi", 2.0);
		System.out.println(carOne);
		

	}

}
