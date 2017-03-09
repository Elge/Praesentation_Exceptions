package de.sgoral.baleipzig.cs.praesentation.exceptions.part1;

public class Example7 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (IllegalAccessException e) {
		}

		method2();
	}

	public static void method1() throws IllegalAccessException {
		throw new IllegalAccessException();
	}

	public static void method2() {
		throw new NullPointerException();

	}

}
