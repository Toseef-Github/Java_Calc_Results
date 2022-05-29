package com.qa.scanner;

import java.util.Scanner;

public class ScannersPractice {

	public static void main(String[] args) {
		
        // Set up scanner object
        Scanner scan = new Scanner(System.in);

        // Read an integer from the user
        System.out.println("Please enter a number: ");
        String AddTwoNum = scan.nextLine();    
        
        scan.nextLine();	
        
        // Read a whole line from the user
        System.out.println("Please enter a message: ");
        String second = scan.nextLine(); // <- This will appear to be skipped

        // Print the responses
        System.out.println("First value = " + AddTwoNum);
        System.out.println("Second value = " + second);
    }
}
	
	
