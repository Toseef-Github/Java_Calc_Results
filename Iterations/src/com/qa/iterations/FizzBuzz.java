package com.qa.iterations;

public class FizzBuzz {

	private int number;
	
public FizzBuzz(int num) {
	this.number = num;
}

public String fizzBuzz() {
	if(number % 3 ==0 && number % 5 == 0) {
		return "FizzBuzz";
	} else if(number % 3 == 0) {
		return "Fizz";
	} else if(number % 5 == 0) {
		return "Buzz";
	}
return String.valueOf(number);
		
	}
}


