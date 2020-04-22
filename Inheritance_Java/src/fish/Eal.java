package fish;

public class Eal extends Fish {

	private String weapon = "Release Electric Charge";

	public Eal(int height, int weight, String animal_type, String blood_type, String live, String gills) {
		super(height, weight, animal_type, blood_type, live, gills);
		// TODO Auto-generated constructor stub
	}

	public String getWeapon() {
		return weapon;
	}

	@Override
	public String toString() {
		return "Eal : [weapon = " + weapon + ", Live = " + getLive() + ", Gills = " + getGills() + ", Height = "
				+ getHeight() + ", Weight = " + getWeight() + ", Animal_type = " + getAnimal_type() + ", Blood_type = "
				+ getBlood_type() + "]";
	}

	public void ShowInfo() {
		System.out.println(toString());
	}
}
