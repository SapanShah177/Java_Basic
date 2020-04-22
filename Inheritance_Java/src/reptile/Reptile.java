package reptile;

import animals.Animal;

public class Reptile extends Animal {

	private String skin;
	private String backbone;
	private String eggs = "Soft-Shelled Eggs";

	public Reptile(int height, int weight, String animal_type, String blood_type, String skin, String backbone) {
		super(height, weight, animal_type, blood_type);
		this.skin = skin;
		this.backbone = backbone;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getBackbone() {
		return backbone;
	}

	public void setBackbone(String backbone) {
		this.backbone = backbone;
	}

	public String getEggs() {
		return eggs;
	}

	@Override
	public String toString() {
		return "Reptile [skin = " + skin + ", backbone = " + backbone + ", eggs = " + eggs + ", Height = " + getHeight()
				+ ", Weight = " + getWeight() + ", Animal_type = " + getAnimal_type() + ", Blood_type = "
				+ getBlood_type() + "]";
	}

	public void ShowInfo() {
		System.out.println(toString());
	}

}
