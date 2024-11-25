package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class Airfield {
	
	private List<Jet> fleet = new ArrayList<>();

	public Airfield() {
		loadJetsFromFile("jets.txt");
	}
	private void loadJetsFromFile(String fileName) {

		 try {
			 BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"));
			 String line;
			 while ((line = bufIn.readLine()) != null) {
				 
				 String[] jetData = line.split(",");
				 
				 String jetType = jetData[0];
				 String jetModel = jetData[1];
				 int jetSpeed = Integer.parseInt(jetData[2]);
			     int jetRange = Integer.parseInt(jetData[3]);
				 double jetPrice = Double.parseDouble(jetData[4]);
				 

				if (jetType.equals("Cargo")) {
					fleet.add(new CargoJet(jetModel, jetSpeed, jetRange, jetPrice));
				}
				else if (jetType.equals("Fighter")) {
					fleet.add(new FighterJet(jetModel, jetSpeed, jetRange, jetPrice));
				}
				else if (jetType.equals("Passenger")) {
					fleet.add(new PassengerJet(jetModel, jetSpeed, jetRange, jetPrice));
				}
				 
			 }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
//		 	catch (ArrayIndexOutOfBoundsException e) {
//		 		System.err.println(e);
//		 	}
		 }
	public void listFleet() {
			for (Jet jet : fleet) {
				if (jet instanceof CargoJet) {
					((CargoJet)jet).toString();
				}
				else if (jet instanceof FighterJet) {
					((FighterJet)jet).toString();
				}
				else if (jet instanceof PassengerJet) {
					((PassengerJet)jet).toString();
				}
				System.out.println(jet);
			}
		}
	
	public void fly() {
		for (Jet jet : fleet) {
			jet.fly();
		}
		
		
	}
	
	public void fastestJet() {
		Jet fastestJet = fleet.get(0);
		for (int i = 1; i < fleet.size(); i++) {
			if (fastestJet.getSpeed() < fleet.get(i).getSpeed()) {
				fastestJet = fleet.get(i);
			}
		}
		System.out.println("The fastest jet in the fleet is the " + fastestJet.getModel() + " with a max speed of " + fastestJet.getSpeed() + "!");
	}
	public void jetWithLongestRange() {
		Jet j = fleet.get(0);
		for (int i = 1; i < fleet.size(); i++) {
			if (j.getRange() < fleet.get(i).getRange()) {
				j = fleet.get(i);
			}
		}
		System.out.println("The jet with the longest range in the fleet is the " + j.getModel() + " with a max range of " + j.getRange() + "!");
		
	}
	
	public void loadCargo() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoJet) {
				((CargoJet)jet).loadCargo();
			}
		}
	}
	
	public void fight() {
		for (Jet jet : fleet) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
			}
		}
	}
	
	public void addPassengerJet() {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What model passenger jet is it?");
		String model = kb.next();
		System.out.println("What is the top speed of the jet?");
		int speed = kb.nextInt();
		System.out.println("What is the range of the jet?");
		int range = kb.nextInt();
		System.out.println("What is the price of the jet?");
		double price = kb.nextDouble();
		Jet newJet = new PassengerJet(model, speed, range, price);
		fleet.add(newJet);
		
	}
	public void removeJet() {
		Scanner kb = new Scanner(System.in);
		
		for (int i = 0; i < fleet.size(); i++) {
			Jet jets = fleet.get(i);
			System.out.println(i + ":" + jets.getModel());
		}
		
		System.out.println();
		System.out.println("Which jet would you like to remove? Please enter a number.");
		int userChoice = kb.nextInt();
		Jet removedJet = fleet.remove(userChoice);
		System.out.println("You removed " + removedJet.getModel() + "!" );
		
		for (int i = 0; i < fleet.size(); i++) {
			Jet jets = fleet.get(i);
			System.out.println(i + ":" + jets.getModel());
		}
		
	}
}

