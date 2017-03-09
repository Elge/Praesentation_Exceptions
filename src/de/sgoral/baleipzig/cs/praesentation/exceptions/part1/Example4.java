package de.sgoral.baleipzig.cs.praesentation.exceptions.part1;

public class Example4 {

	public static void main(String[] args) {
		try {
			System.out.println("Calling bad method");
			goodMethod();
			System.out.println("Bad method called");
		} catch (Exception e) {
			System.out.println("Exception caught");
		} finally {
			System.out.println("Finally block");
		}
	}
	
	public static void goodMethod() throws Exception {
		// Nothing bad happens
	}
	
}
