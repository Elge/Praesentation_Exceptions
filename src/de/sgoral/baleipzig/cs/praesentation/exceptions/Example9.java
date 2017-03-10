package de.sgoral.baleipzig.cs.praesentation.exceptions;

/**
 * Beispiel für multi catch
 */
public class Example9 {

	public static void main(String[] args) {
		try {
			doSomethingVeryBad();
		} catch (IllegalAccessException | IllegalArgumentException
				| IllegalStateException e) {
			System.out.println("Abgefangen: " + e);
		}
	}

	public static void doSomethingVeryBad() throws IllegalAccessException, 
			IllegalArgumentException, IllegalStateException {
		double random = Math.random();
		if (random < 0.333) {
			throw new IllegalAccessException();
		} else if (random > 0.666) {
			throw new IllegalArgumentException();
		} else {
			throw new IllegalStateException();
		}
		
	}
	
}
