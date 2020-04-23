package org.java;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		Map<Integer, String> student = new HashMap<>();
		
		student.put(4, "Zil");
		student.put(1, "Sapan");
		student.put(2, "Keya");
		student.put(3, "Manan");
		
		for(Map.Entry<Integer, String> data : student.entrySet()) {
			System.out.println(data.getValue());
		}
		
		System.out.println("****************************");
		
		for(String key : student.values()) {
			System.out.println(key);
		}
	}

}
