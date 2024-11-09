package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FighterJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		System.out.println("Pew pew, brrrrrrrrrrr brrrrrrrrrrr");
		// TODO Auto-generated method stub
		
	}
	
//	public void fly() { 
//		double airTime = speed/range;
//		System.out.println(  + " taking off! I'll be flying for " + airTime + " hours");
//		
//	}

}
