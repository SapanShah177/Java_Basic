package org.java;

import java.util.ArrayList;
import java.util.List;

public class App3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(200);
		list.add(70);
		list.add(40);
		list.add(80);
		list.add(100);

		list.forEach(i -> {
			if (i >= 20) {
				System.out.println(i);
			}

		});

	}

}
