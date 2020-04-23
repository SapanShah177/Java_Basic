package org.java;

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	public void countMe() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < 10 ; i++) {
			System.out.println("The Value of I is: " + i + " Thread Number is: " + threadNo);
		}
	}

	@Override
	public void run() {
		countMe();
	}
	
	
}
public class App {

	public static void main(String[] args) {
		
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
		counter1.start();
		System.out.println("************************");
		counter2.start();

	}

}
