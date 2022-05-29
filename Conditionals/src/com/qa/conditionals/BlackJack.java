package com.qa.conditionals;

public class BlackJack {

public String play(int handOne, int handTwo) {
	if(handOne <= 0 || handTwo <= 0) {
		return "Hand(s) cannot be zero or below";
	} else if (handOne > 21 && handTwo > 21) {
		return "Both hands are bust!"; 
	} else if(handOne == handTwo) {
		return "No winner";
	} else if(handOne > 21) {
		return "Hand two wins " + handTwo;
	} else if(handTwo > 21) {
		return "Hand one wins " + handOne;
	} else if(handOne > handTwo) {
		return "Hand one wins " + handOne;
	} else {
			return "Hand two wins " + handTwo;
		
		}
			
		}
		}
