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
	}
	private void displayUserMenu() {
//		sysouts
		
	}

}
