package org.java;

import java.util.Random;

class MyCounter1 implements Runnable{
	private int threadNo;

	public MyCounter1(int threadNo) {
		this.threadNo = threadNo;
	}
	
	public void countMe() {
		
		Random random = new Random();
		for(int i = 0; i < 10 ; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The Value of I is: " + i + " Thread Number is: " + threadNo);
		}
	}

	@Override
	public void run() {
		countMe();
	}
	
	
}
public class App1 {

	public static void main(String[] args) {
		
		Thread counter1 = new Thread(new MyCounter1(1));
		Thread counter2 = new Thread (new MyCounter1(2));
		
		counter1.start();
		System.out.println("************************");
		counter2.start();

	}

}
