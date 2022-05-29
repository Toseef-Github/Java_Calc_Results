package com.qa.customer;

public class Runner {

	public static void main(String[] args) {

		Customer defaultCust = new Customer();
		Customer custOne = new Customer("Eden", "Hazard", 31);
		Customer custTwo = new Customer("Didier", "Drogba");
		Customer custThree = new Customer(25);
		Customer custFour = new Customer("Toseef", "Mehdi", 26);

		System.out.println(custOne);

		System.out.println("====================================================================");

		System.out.println(custOne.getFristName());
		System.out.println(custOne.getLastName());
		System.out.println(custOne.getAge());

		System.out.println("====================================================================");

		defaultCust.setFristName("Thomas");
		defaultCust.setLastName("Tuchel");
		defaultCust.setAge(42);

		System.out.println(defaultCust);

		System.out.println("====================================================================");
		System.out.println(custTwo);

		System.out.println("====================================================================");
		System.out.println(custThree);

		System.out.println("====================================================================");
		System.out.println(custFour);

	}

}
