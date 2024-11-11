package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {

	
	private Airfield airField = new Airfield();
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		app.launch();

		kb.close();
		
	}
	
	private void launch() {
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
			airField.addJet();
			break;
		case 8:
			airField.removeJet();
			break;
		case 9:
			System.out.println("Bye bye");
			
		}
	}
		
}
