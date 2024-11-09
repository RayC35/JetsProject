package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {

	
	private Airfield airField = new Airfield();
	private static Scanner kb;

//	No other fields, no list of jets
	
	public static void main(String[] args) {
		kb = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		app.launch();

		
		
		kb.close();

		
	}
	
	private void launch() {
//		Loop: displayUserMenu(), get choice from scanner, and act on choice
		displayUserMenu();
	}
	private void displayUserMenu() {
		System.out.println("***********************AIRFIELD**********************");
		System.out.println("1.List Fleet                    6.DOGFIGHT!!");
		System.out.println("2.Fly All Jets                  7.Add A Passenger Jet");
		System.out.println("3.View Fastest Jet              8.Remove A Jet");
		System.out.println("4.View Jet With Longest Range   9.Quit");
		System.out.println("5.Load All Cargo Jets");
		System.out.println("*****************************************************");
	}
	private void userChoice() {
		System.out.println("Please enter a number");
		int choice = kb.nextInt();
		
		
		switch (choice) {
		case 1:
			airField.listFleet();
			break;
		case 2:
			airField.fly();
			break;
		case 3:
			airField.fastestJet();
			break;
		case 4:
			airField.jetWithLongestRange();
			break;
		case 5:
			airField.loadCargo();
			break;
		case 6:
			airField.fight();
			break;
		case 7:
			System.out.println("What model jet is it?");
			String model = kb.next();
			System.out.println("What is the top speed of the jet?");
			int speed = kb.nextInt();
			System.out.println("What is the range of the jet?");
			int range = kb.nextInt();
			System.out.println("What is the price of the jet?");
			double price = kb.nextDouble();
			Jet newJet = new PassengerJet(model, speed. range, price);
			break;
//		case 8:
//			removeJet();
//			break;
//		case 9:
//			System.out.println("Bye bye");
//			
		}
	}
		
}
