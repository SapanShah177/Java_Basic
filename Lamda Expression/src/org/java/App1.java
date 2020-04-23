package org.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

}

public class App1 {

	public static void main(String[] args) {

		List<Data> list = new ArrayList<>();
		list.add(new Data("Sapan"));
		list.add(new Data("Keya"));
		list.add(new Data("Manan"));
		list.add(new Data("Tarang"));
		list.add(new Data("Jay"));
		list.add(new Data("Prachi"));

		// Without Lambda

		/*
		 * Collections.sort(list, new Comparator<Data>() {
		 * 
		 * @Override public int compare(Data o1, Data o2) {return
		 * o1.getName().compareTo(o2.getName());} });
		 */

		// With Lambda

		/*
		 * Collections.sort(list, (Data o1, Data o2)->
		 * o1.getName().compareTo(o2.getName()));
		 */

		// With multiple statement in Lambda

		Collections.sort(list, (Data o1, Data o2) -> {

			if (o1.getName().length() < o2.getName().length()) {
				return -1;
			} else if (o1.getName().length() > o2.getName().length()) {
				return 1;
			} else {
				return 0;
			}
		});

		for (Data data : list) {
			System.out.println(data.getName());
		}
	}
}
