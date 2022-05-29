package com.qa.array;

public class Arrays {

public int[] numArrayOne = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
public int[] numArrayTwo = new int[3];

public void callNum() {
	System.out.println(numArrayOne[10]);
}

public void qOne() {
	for (int i = 0; i < numArrayOne.length; i++) {
		System.out.println(numArrayOne[i]);
	}
}
public void qTwo() {
	for (int i = 0; i < numArrayOne.length; i++) {
		System.out.println(numArrayOne[i]*10);
	}

}
}