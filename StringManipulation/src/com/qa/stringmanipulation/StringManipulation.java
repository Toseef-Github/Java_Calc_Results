package com.qa.stringmanipulation;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] makeMeAString = {'H', 'E', 'L', 'L', 'O', 'O'};
		String madeString = new String(makeMeAString);
		System.out.println(madeString);

		char[] charArray = {'T','O','S','E','E','F'};
		String makeString = new String(charArray);
		System.out.println(makeString);
		
		System.out.println(makeString.substring(2, 6));
		
		System.out.println(makeString.replace("T", "J"));
	}

}
