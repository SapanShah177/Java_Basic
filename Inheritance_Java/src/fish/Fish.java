package fish;

import animals.Animal;

public class Fish extends Animal {

	private String live;
	private String gills;

	public Fish() {
		super();
	}

	public Fish(int height, int weight, String animal_type, String blood_type, String live, String gills) {
		super(height, weight, animal_type, blood_type);
		this.live = live;
		this.gills = gills;
	}

	public String getLive() {
		return live;
	}

	public void setLive(String live) {
		this.live = live;
	}

	public String getGills() {
		return gills;
	}

	public void setGills(String gills) {
		this.gills = gills;
	}

	@Override
	public String toString() {
		return "Fish [live = " + live + ", gills = " + gills + ", Height = " + getHeight() + ", Weight = " + getWeight()
				+ ", Animal_type = " + getAnimal_type() + ", Blood_type = " + getBlood_type() + "]";
	}

	public void ShowInfo() {
		System.out.println(toString());
	}

}
