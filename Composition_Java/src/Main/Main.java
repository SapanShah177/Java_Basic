package Main;

import laptop.Laptop;
import laptop_components.Graphic_Card;
import laptop_components.Processor;

public class Main {

	public static void main(String[] args) {

		Laptop laptop = new Laptop();
		System.out.println(laptop);

		System.out.println("------------------------------------------------------------------------------");

		// CALLING OBJECT INSIDE OBJECT

		System.out.println(laptop.getGraphicsCard());

		System.out.println("------------------------------------------------------------------------------");

		// CALLING METHODS, OBJECT INSIDE OBJECT

		System.out.println(laptop.getGraphicsCard().getSeries());

		System.out.println("------------------------------------------------------------------------------");

		// CALLING BY PARAMETERIZED CONSTRUCTOR

		Laptop gamingLaptop = new Laptop(17f,
				new Processor("intel", "7200U", 7, 4, 4, "6MB", "2.5Ghz", "2.5Ghz", "3.1Ghz"), "DDR4", "2TB",
				new Graphic_Card("Nvidia", 1050, "8GB"), null, "Backlit");

		System.out.println("Gaming " + gamingLaptop);

		System.out.println("------------------------------------------------------------------------------");

		// ADDING FUNCTIONALITY

		System.out.println(gamingLaptop.gamingMode());

		System.out.println("Gaming Mode Frequency : " + gamingLaptop.getProcessor().getFrequency());

	}

}
