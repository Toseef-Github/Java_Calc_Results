package com.qa.calculations;

public class Operators {

	private double num1;
	private double num2;
	
public Operators(double num1, double num2) {
	
this.num1 = num1;
this.num2 = num2;

}

public String addTwoNums() {
	double result = num1 + num2;
	return num1 + " + " + num2 + " = " + result;
	
}

public String subTwoNums() {
	double result = num1 - num2;
	return num1 + " - " + num2 + " = " + result;
	
}

public String divTwoNums() {
	double result = num1 / num2;
	return num1 + " / " + num2 + " = " + result;
	
}

public String multiTwoNums() {
	double  result = num1 * num2;
	return num1 + " * " + num2 + " = " + result;
	
}
}
