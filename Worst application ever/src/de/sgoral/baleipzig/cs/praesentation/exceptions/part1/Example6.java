package de.sgoral.baleipzig.cs.praesentation.exceptions.part1;

public class Example6 {

	public static void main(String[] args) {
		try {
			badMethod();
		} catch (Exception e) {
			System.out.println("I have an exception! But which one?");
			System.out.println(e.toString());
		}
	}
	
	public static void badMethod() throws CustomException {
		throw new CustomException(1);
	}
	
}
