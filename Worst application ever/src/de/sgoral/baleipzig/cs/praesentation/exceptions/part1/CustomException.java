package de.sgoral.baleipzig.cs.praesentation.exceptions.part1;

import java.util.HashMap;

public class CustomException extends Exception {

	private int errorCode;
	
	public CustomException(int errorCode) {
		this.errorCode = errorCode;
	}
	
	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessages.get(errorCode);
	}

	@Override
	public String toString() {
		return "CustomException[code:" + getErrorCode() + ";message:" + getErrorMessage() + "]";
	}

	private static final HashMap<Integer, String> errorMessages = new HashMap<>();
	
	static {
		errorMessages.put(1, "Error opening file");
		errorMessages.put(2, "Error closing file");
		errorMessages.put(3, "Error thinking of new examples");
	}
	
}
