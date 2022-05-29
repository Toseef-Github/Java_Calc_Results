package com.qa.interation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylists {

	public static void main(String[] args) {
		
		List<String> colours = new ArrayList<>();
		
		colours.add("Blue");
		colours.add("Red");
		colours.add("Black");
		colours.add("Yellow");
		colours.add("Orange");
		
	System.out.println(colours);
		
	for(int i = 0; i < colours.size(); i++) {
		System.out.println(colours.get(i));
		
	}
	
	System.out.println(colours.get(2));
		
	colours.set(4, "pink");
	
	System.out.println(colours);
	
	colours.remove(3);
	
	System.out.println(colours);
	
	Collections.sort(colours);
	
	for (String string : colours) {
		System.out.println(string);
	}
	
	int[] numberList= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	for (int i : numberList) {
		System.out.println(i * i); 
		}

	

	if(numberList[1] % 2 == 0) {
		System.out.println("True");}
	
	else {
			System.out.println("False");
		}
		
	for (Integer i : numberList) {
		if (i % 2 == 0) { 
			System.out.println(Math.round(Math.pow(i, 3)) );
		} else { 
			System.out.println(Math.round(Math.pow(i, 2)) );
			
		}
		
	}
		
	}
	
	}

