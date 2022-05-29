	package com.qa.objectorientedprogramming;
	
	public class car {
		
		private String colour;
		private int horsepower;
		private boolean convertable;
		private String model;
		private double engineSize;
		
//		default constructor	
		public car () { }
		
//		everything constructor 
		
		public car (String colour, int horsepower, boolean convertable, String model, double engineSize) {
			
			this.colour = colour;
			this.horsepower = horsepower;
			this.convertable = convertable;
			this.model = model;
			this.engineSize = engineSize;
		
				
		}
// getters and setters
		
		public String getColour() {
			return colour;
		}
		
		public void setColour(String newColour) {
			this.colour = newColour;
		}
		
		public int getHorsepower() {
			return horsepower;
		}
		
		public void setHorsepower(int newHorsepower) {
			this.horsepower = newHorsepower;
		}
		
		public boolean getConvertable() {
			return convertable;
			
		}
		
		public void setConvertable(boolean newConvertable) {
			this.convertable = newConvertable;
		}
		
		public String getModel() {
			return model;
		}
		
		public void setModel(String newModel) {
			this.model = newModel;
			
		}
		
		public double getEngineSize() {
			return engineSize;
			
		}
		
		public void setEngineSize(double newEngineSize) {
			this.engineSize = newEngineSize;
		}
		
// 		third constructor
		public car (String colour, int horsepower) {
			
			this.colour = colour;
			this.horsepower = horsepower;
		
			
		}
		
		public String toString() {
			return colour + " " + horsepower + " " + convertable + " " + model + " " + engineSize;
		}
		
	}
