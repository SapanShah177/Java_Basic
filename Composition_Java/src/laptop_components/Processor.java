package laptop_components;

public class Processor {

	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String MinFrequency;
	private String MaxFrequency;

	public Processor() {
		this.brand = "Intel";
		this.series = "I7 800u";
		this.generation = 8;
		this.cores = 4;
		this.threads = 4;
		this.cacheMemory = "3MB";
		this.frequency = "2.5Ghz";
		MinFrequency = "2.5Ghz";
		MaxFrequency = "3 Ghz";
	}

	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxFrequency) {

		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		MinFrequency = minFrequency;
		MaxFrequency = maxFrequency;
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public int getGeneration() {
		return generation;
	}

	public int getCores() {
		return cores;
	}

	public int getThreads() {
		return threads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getMinFrequency() {
		return MinFrequency;
	}

	public String getMaxFrequency() {
		return MaxFrequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Processor : [Brand = " + brand + ", Series = " + series + ", Generation = " + generation + ", Cores = "
				+ cores + ", Threads = " + threads + ", Cache Memory = " + cacheMemory + ", Frequency = " + frequency
				+ ", Min Frequency = " + MinFrequency + ", Max Frequency = " + MaxFrequency + "]";
	}

}
