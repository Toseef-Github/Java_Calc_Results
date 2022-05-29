package com.qa.customer;

public class Customer {

	private String fristName;
	private String lastName;
	private int age;
	
public Customer() {} 

public Customer(String forename, String surname) {
this.fristName = forename;
this.lastName = surname;

}

public Customer(String forename, String surname, int age) {

	this.fristName = forename;
	this.lastName= surname;
	this.age = age;
	
}

public Customer(int age) {
	this.age = age;
	
}

public String getFristName() {
	return fristName;
}

public void setFristName(String fristName) {
	this.fristName = fristName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Frist Name = " + fristName + ", Last Name = " + lastName + ", Age = " + age;
	
}



}
