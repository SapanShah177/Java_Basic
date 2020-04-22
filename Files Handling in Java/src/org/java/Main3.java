// Reading a file with Buffer reader

package org.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("StudyJava\\team.txt"));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}

	}

}
