package org.study;

class GenericClass<T> {
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}

}

public class GenericApp {

	public static void main(String[] args) {

		GenericClass<Integer> genericData = new GenericClass<Integer>(1);
		int data = genericData.getData();
		System.out.println(data);

	}

}
