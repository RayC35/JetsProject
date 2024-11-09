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
		System.out.println("*******************AIRFIELD*******************");
		System.out.println("1.List Fleet                    6.DOGFIGHT!!");
		System.out.println("2.Fly All Jets                  7.Add A Jet");
		System.out.println("3.View Fastest Jet              8.Remove A Jet");
		System.out.println("4.View Jet With Longest Range   9.Quit");
		System.out.println("5.Load All Cargo Jets");
		System.out.println("**********************************************");
	}
	private void userChoice() {
		System.out.println("Please enter a number");
		int choice = kb.nextInt();
		
		
		switch (choice) {
		case 1:
			listFleet();
			break;
		case 2:
//			fly();
			break;
		case 3:
			
			
		}
	}
		
//		sysouts
		

}
