package bird;

public class Eagle extends Bird {

	public Eagle(int height, int weight, String animal_type, String blood_type, String feathers, String fly) {
		super(height, weight, animal_type, blood_type, feathers, fly);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Eagle : [Feathers = " + getFeathers() + ", Fly = " + getFly() + ", Height = " + getHeight()
				+ ", Weight = " + getWeight() + ", Animal_type = " + getAnimal_type() + ", Blood_type = "
				+ getBlood_type() + "]";
	}

	public void ShowInfo() {
		System.out.println(toString());
	}
}
