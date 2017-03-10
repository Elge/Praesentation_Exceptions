package de.sgoral.baleipzig.cs.praesentation.exceptions;

/**
 * Beispiel für Hierarchie catch
 */
public class Example95 {

	public static void main(String[] args) {
		try {
			badMethod();
		} catch (CustomException e) {
			System.out.println("CustomException gefangen: " + e);
		} catch (Exception e) {
			System.out.println("Generische Exception gefangen: " + e);
		}
	}
	
	public static void badMethod() throws CustomException {
		throw new CustomException(2);
	}
	
}
