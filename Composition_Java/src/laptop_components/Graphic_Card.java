package laptop_components;

public class Graphic_Card {

	private String brand;
	private int series;
	private String memory;

	public Graphic_Card() {

		this.brand = "Nvidia";
		this.series = 940;
		this.memory = "4 GB";
	}

	public Graphic_Card(String brand, int series, String memory) {

		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	public String getBrand() {
		return brand;
	}

	public int getSeries() {
		return series;
	}

	public String getMemory() {
		return memory;
	}

	@Override
	public String toString() {
		return "Graphic_Card : [Brand = " + brand + ", Series = " + series + ", Memory = " + memory + "]";
	}

}
