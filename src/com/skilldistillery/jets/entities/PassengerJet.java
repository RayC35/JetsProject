package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	public PassengerJet() {
		super();
	}

	public PassengerJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "PassengerJet [toString()=" + super.toString() + "]";
	}

	
}
