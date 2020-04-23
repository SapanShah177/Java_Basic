package org.java;

interface Lamda {
	abstract public void demo(int x, int y);
}

public class App2 {

	public static void main(String[] args) {
		
		Lamda lambda = (int x, int z) -> {
			System.out.println("Value of i: " + (x+z));
			System.out.println("In Lmabda Statement.");
			};
		lambda.demo(200,100);

	}

}
