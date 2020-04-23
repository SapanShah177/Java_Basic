package org.java;

interface Lambda{
	public void demo(String name);
}

public class App {

	public static void main(String[] args) {
		
		// Without Lambda Expression
		
		Lambda lambda = new Lambda() {

			@Override
			public void demo(String name) {
				System.out.println("Without Lambda Expression Statement 1." + name);
				
			}
		};
		lambda.demo("Sapan");
		
		System.out.println("******************************************************");
		
		Lambda lambda1 = (String name)-> System.out.println("With Lambda Expression Statement 2. " + name);
		lambda1.demo("Saya");
		
		System.out.println("******************************************************");
		
		// Multiple statement.
		
		Lambda lambda2 = (String name)-> {
			System.out.println("With Lambda Expression Statement 3. " + name);
			System.out.println("With Lambda Expression Statement 4. " + name);
		
		};
		lambda2.demo("Keya");
 
	}

}
