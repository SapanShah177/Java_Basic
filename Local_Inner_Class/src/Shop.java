import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key: ");
		String key = sc.next();
		if(door.islocked(key)) {
			System.out.println("Shop has cloased, Please visit again.");
		}
		else {
			System.out.println("Welcome to Shop.");
		}
		sc.close();
	}

}
