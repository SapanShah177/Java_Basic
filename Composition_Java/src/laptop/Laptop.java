package laptop;

import laptop_components.Graphic_Card;
import laptop_components.Processor;

public class Laptop {

	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private Graphic_Card graphicsCard;
	private String opticalDrive;
	private String keyboard;

	public Laptop() {
		this.screen = 16f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicsCard = new Graphic_Card();
		this.opticalDrive = "MLT layer";
		this.keyboard = "Backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, Graphic_Card graphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	public float getScreen() {
		return screen;
	}

	public Processor getProcessor() {
		return processor;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public Graphic_Card getGraphicsCard() {
		return graphicsCard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}

	@Override
	public String toString() {
		return "Laptop : [Screen = " + screen + ", Processor = " + processor + ", Ram = " + ram + ", Hard Drive = "
				+ hardDrive + ", Graphics Card = " + graphicsCard + ", Optical Drive = " + opticalDrive
				+ ", Keyboard = " + keyboard + "]";
	}
	
	public String gamingMode() {
		
		processor.setFrequency(processor.getMaxFrequency());
		return "Gaming Mode On.";
	}

}
