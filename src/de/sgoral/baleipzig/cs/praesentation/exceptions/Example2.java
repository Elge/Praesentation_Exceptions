package de.sgoral.baleipzig.cs.praesentation.exceptions;

public class Example2 {

	public static void main(String[] args) {
		try {
			badMethod();
		} catch (Exception e) {
			System.out.println("Pssst. No one has to know!");
		}
	}
	
	public static void badMethod() throws Exception {
		throw new Exception("This method has not been implemented yet");
	}
	
}
