package de.sgoral.baleipzig.cs.praesentation.exceptions;

/**
 * Beispiel für finally
 */
public class Example3 {

	public static void main(String[] args) {
		try {
			System.out.println("Calling bad method");
			badMethod();
			System.out.println("Bad method called");
		} catch (Exception e) {
			System.out.println("Exception caught");
		} finally {
			System.out.println("Finally block");
		}
	}
	
	public static void badMethod() throws Exception {
		throw new Exception("This method has not been implemented yet.");
	}
	
}
