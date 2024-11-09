package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
			 BufferedReader bufIn = new BufferedReader(new FileReader(fileName));
			 String line;
			 while ((line = bufIn.readLine()) != null) {
				 
				 String[] jetData = line.split(", ");
				 
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
		 }
	public void listFleet() {
			for (Jet jet : fleet) {
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
		System.out.println(fastestJet);
	}
	public void jetWithLongestRange() {
		Jet j = fleet.get(0);
		for (int i = 1; i < fleet.size(); i++) {
			if (j.getRange() < fleet.get(i).getRange()) {
				j = fleet.get(i);
			}
		}
		System.out.println(j);
		
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
	
	public void addJet() {
		
	}
	public void removeJet() {
		
	}
}







	//public methods for handling jets


//				 Jet j = new Jet(jetType, jetModel, jetSpeed, jetRange, jetPrice);
//				 fleet.add(j);
//				 System.out.println(j);
//				 System.out.println(line);