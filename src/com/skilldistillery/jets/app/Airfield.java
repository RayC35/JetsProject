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

}







	//public methods for handling jets


//				 Jet j = new Jet(jetType, jetModel, jetSpeed, jetRange, jetPrice);
//				 fleet.add(j);
//				 System.out.println(j);
//				 System.out.println(line);