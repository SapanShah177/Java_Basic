package bird;

import animals.Animal;

public class Bird extends Animal {

	private String feathers;
	private String fly;

	public Bird(int height, int weight, String animal_type, String blood_type, String feathers, String fly) {
		super(height, weight, animal_type, blood_type);
		this.feathers = feathers;
		this.fly = fly;
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public String getFly() {
		return fly;
	}

	public void setFly(String fly) {
		this.fly = fly;
	}

	@Override
	public String toString() {
		return "Birds [feathers =" + feathers + ", fly = " + fly + ", Height = " + getHeight() + ", Weight = "
				+ getWeight() + ", Animal_type = " + getAnimal_type() + ", Blood_type = " + getBlood_type() + "]";
	}

	public void ShowInfo() {
		System.out.println(toString());
	}

}
