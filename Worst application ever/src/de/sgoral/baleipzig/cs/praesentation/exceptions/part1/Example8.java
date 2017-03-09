package de.sgoral.baleipzig.cs.praesentation.exceptions.part1;

public class Example8 {
	
	public static void main(String[] args) throws CustomException {
		method1();
	}
	
	public static void method1() throws CustomException {
		method2();
	}
	
	public static void method2() throws CustomException {
		method3();
	}
	
	public static void method3() throws CustomException {
		try {
			method4();			
		} catch (Exception e) {
			CustomException ex = new CustomException(1);
			ex.initCause(e);
			throw ex;
		}
	}
	
	public static void method4() throws Exception {
		method5();
	}
	
	public static void method5() throws Exception {
		method6();
	}
	
	public static void method6() throws Exception {
		method7();
	}
	
	public static void method7() throws Exception {
		throw new Exception();
	}

}
