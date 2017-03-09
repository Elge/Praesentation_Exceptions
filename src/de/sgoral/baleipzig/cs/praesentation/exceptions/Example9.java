package de.sgoral.baleipzig.cs.praesentation.exceptions;

import java.io.File;
import java.io.IOException;

public class Example9 {

	public void translateFile(File original) {
		File tempFile = null;
		try {
			tempFile = File.createTempFile("translate", "dest");
			// Translate the file
		} catch (IOException e) {
			System.out.println("Cannot translate file");
		} finally {
			if (tempFile != null) {
				tempFile.delete();
			}
		}
	}
	
}
