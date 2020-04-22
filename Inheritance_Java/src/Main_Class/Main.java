package Main_Class;

import bird.Eagle;
import fish.Eal;
import reptile.Crocodile;

public class Main {

	public static void main(String[] args) {
		
		Eal eal = new Eal(20, 30, "Fish", "Cold", "Water", "Yes");
		eal.ShowInfo();
		
		System.out.println("------------------------------------------------------------------------------");
		
		Crocodile crocodile = new Crocodile(50, 100, "Reptile", "Hot", "Dry", "Yes");
		crocodile.ShowInfo();;
		
		System.out.println("------------------------------------------------------------------------------");		
		
		Eagle eagle = new Eagle(20, 50, "Bird", "Hot", "Yes", "Yes");
		eagle.ShowInfo();
	}

}
