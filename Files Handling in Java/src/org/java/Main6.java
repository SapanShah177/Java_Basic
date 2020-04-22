// Input from Console

package org.java;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Number: ");
		int x = scan.nextInt();
		scan.close();
		System.out.println("The Number is: " + x);

	}

}
