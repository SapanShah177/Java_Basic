package org.java;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		// Creating a file.
		File file = new File("StudyJava.txt");
		file.createNewFile();
		System.out.println("New File Created.");

		// create single Directory
		File directory = new File("StudyJava");
		directory.mkdir();
		System.out.println("Directory created.");

		// create multiple Directories
		File directories = new File("StudyJava\\author\\sapan");
		directories.mkdirs();
		System.out.println("Directories created.");
	}
}
