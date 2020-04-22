//Writing into a file.

package org.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {

		File file = new File("StudyJava");
		file.mkdir();
		System.out.println("Directory created.");

		file = new File("StudyJava\\team.txt");
	
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,false))){
			bw.write("Sapan");
			bw.newLine();
			bw.write("Keya");
			bw.newLine();
			bw.write("Manan");
			bw.newLine();
			bw.write("Tarang");
			bw.newLine();
			bw.write("Jay");
			System.out.println("Writing onto file completed.");
			bw.close();
			
		} catch (IOException e) {
			System.out.println("Error occured while writing into a file.");
		}
	}

}
