package com.qa.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
	
ArrayList cars = new ArrayList();

// add to array list
cars.add("Audi");
cars.add("BMW");
cars.add("Mercedes");
cars.add("Ferrari");

System.out.println(cars);

// get specific item from list using index number
System.out.println(cars.get(0));

// replace item in list for new item by identifying index number and typing new item
cars.set(1, "Lamborghini");

System.out.println(cars);

// find size of list 
cars.size();

// remove item from list 
// cars.remove(3);

// clear whole list 
// cars.clear();

//use cities.get(i) to print each value in the list
//if you print just the list, you get all 4 values 4 times
for(int i = 0; i < cars.size(); i++) {
	System.out.println(cars);
}

System.out.println("=======================================");

Collections.reverse(cars);
System.out.println(cars);
Collections.swap(cars, 1, 3);
System.out.println(cars);

		


	}

}
