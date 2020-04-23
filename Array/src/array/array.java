package array;

import java.util.*;

public class array {

	public static void main(String[] args) {
		
		int value = 10;
		displayNumber();

	}
	
	public static void displayNumber() {

		List<String> countries = new LinkedList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Pakistan");
		countries.add("Australlia");
		countries.add("Canada");
		System.out.println(countries);
		System.out.println("***********************");
		array array = new array();
		array.printlist(countries);
		
	}
	
	void printlist(List<String> list) {
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}
