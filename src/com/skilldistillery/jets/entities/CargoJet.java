package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet() {
		super();
	}

	public CargoJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println(getModel() + " loading cargo!");
	}

	@Override
	public String toString() {
		return "CargoJet [toString()=" + super.toString() + "]";
	}

	
}
