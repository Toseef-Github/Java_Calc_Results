 package com.qa.calculator;

public class Operators {
	
	private int num1;
	private int num2;

	
	public Operators(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public String AddTwoNum() {
		int result = this.num1 + this.num2;
		return this.num1 + " + " + this.num2 + " = " + result;
		
	}
	
	public String MultiplyTwoNum() {
		int result = this.num1 * this.num2;
		return this.num1 + " * " + this.num2 + " = " + result;
		
		
	}
	
	public String SubtractTwoNum() {
		int result = this.num1 - this.num2;
		return this.num1 + " - " + this.num2 + " = " + result;
		
		
	}
	
	public String DivideTwoNum() {
		double result = this.num1 / this.num2;
		return this.num1 + " / " + this.num2 + " = " + result;
		
		
	}
	
	
}
		
	
	
	
	

