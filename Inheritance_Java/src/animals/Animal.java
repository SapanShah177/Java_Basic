package animals;

public class Animal {

	private int height;
	private int weight;
	private String animal_type;
	private String blood_type;

	public Animal() {
		this.height = 0;
		this.weight = 0;
		this.animal_type = "Unknown";
		this.blood_type = "Unknown";
	}

	public Animal(int height, int weight, String animal_type, String blood_type) {
		super();
		this.height = height;
		this.weight = weight;
		this.animal_type = animal_type;
		this.blood_type = blood_type;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getAnimal_type() {
		return animal_type;
	}

	public String getBlood_type() {
		return blood_type;
	}

	@Override
	public String toString() {
		return "Animal [height = " + height + ", weight = " + weight + ", animal_type = " + animal_type
				+ ", blood_type = " + blood_type + "]";
	}

	public void ShowInfo() {
		System.out.println(toString());
	}

}
