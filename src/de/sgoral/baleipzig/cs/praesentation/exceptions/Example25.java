package de.sgoral.baleipzig.cs.praesentation.exceptions;

import java.util.Scanner;

/**
 * Beispiel für Exception Handling bei Zahlen
 */
public class Example25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isNumber = false;
		do {
			System.out.println("Bitte eine Zahl eingeben:");
			String input = scanner.nextLine();
			try {
				double value = Double.parseDouble(input);
				isNumber = true;
				System.out.println("Ihre Zahl ist " + value);
			} catch (NumberFormatException e) {
				System.out.println("Fehler! Eingabe ist keine Zahl.");
				main(args);
			}
		} while (!isNumber);
		scanner.close();
	}

}
