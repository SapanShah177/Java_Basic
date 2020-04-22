// Delete A File

package org.java;

import java.io.File;

public class Main5 {

	public static void main(String[] args) {

		File file = new File("StudyJava.txt");
		if(file.delete()) {
			System.out.println("File Deleted.");
		}else {
			System.out.println("Error occured while deleting a file.");
		}

	}

}
