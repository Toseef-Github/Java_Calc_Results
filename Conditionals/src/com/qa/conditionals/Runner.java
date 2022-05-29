package com.qa.conditionals;

public class Runner {

	public static void main(String[] args) {
BlackJack hand = new BlackJack();

System.out.println(hand.play(21, 16));
System.out.println(hand.play(23, 27));
System.out.println(hand.play(11, 11));
System.out.println(hand.play(-4, 20));
System.out.println(hand.play(18, 20));

	}

}
