package com.qa.inheritence;

public class Animal {

	private boolean fly = true;
	private int legs;
	
	public Animal() { }
	
	public Animal(boolean fly, int legs) {
		super();
		this.fly = fly;
		this.legs = legs;
	}
	
		public void noise() {
		System.out.println("meow");
	}
		public void food() {
		System.out.println("dog food");
		}

		@Override
		public String toString() {
			return "Animal [fly=" + fly + ", legs=" + legs + ", toString()=" + super.toString() + "]";
		}
		
	

//	public boolean getFly() {
//		return fly;
//	}
//
//	public void setFly(boolean newValueOfFly) {
//		this.fly = newValueOfFly;
//
//	}
//
//	public int getLegs() {
//		return legs;
//	}
//
//	public void setLegs(int legs) {
//		this.legs = legs;
//	}

	
	}
	
	


