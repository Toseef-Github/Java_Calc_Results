package com.qa.interation;

public class StringManipulation {

	public static void main(String[] args) {
//		exercise1();
//		exercise2();
		
		
	}

		
	public static void exercise1() {
		
		String string1 = "yesterday it was raining"; 
		String string2 = "today it is sunny";
		String string3 = string1.toUpperCase().concat(" " + string2.toUpperCase());
		System.out.println(string3);
		System.out.println(string3.substring(25, 36) + " " + string3.substring(17, 25));
		
	}
	
	public static void exercise2() {
		
		String string1 = "yesterday it was raining"; 
		String string2 = "today it is sunny";
		String string3 = string1.toUpperCase().concat(" " + string2.toUpperCase());
		
		System.out.println(string3.length());

		
	}

	public static void exercise3(String message) {
		int i = 2;
		String wrd = "";
		for(int i1 = message.length(); i1 > 0; i1++); {
			if(message.substring(i, i+1).equals("")) {
				
			}
		}
		
	}

}
