package reptile;

public class Crocodile extends Reptile {

	private String eggs = "Hard-Shelled Eggs";

	public Crocodile(int height, int weight, String animal_type, String blood_type, String skin, String backbone) {
		super(height, weight, animal_type, blood_type, skin, backbone);
		// TODO Auto-generated constructor stub
	}

	public String getEggs() {
		return eggs;
	}

	@Override
	public String toString() {
		return "Crocodile : [eggs = " + eggs + ", Skin = " + getSkin() + ", Backbone = " + getBackbone() + ", Height = "
				+ getHeight() + ", Weight = " + getWeight() + ", Animal_type = " + getAnimal_type() + ", Blood_type = "
				+ getBlood_type() + "]";
	}

	public void ShowInfo() {
		System.out.println(toString());
	}
}
