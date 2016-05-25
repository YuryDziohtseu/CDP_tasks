package by.epam.cdp.task_2_1.devices.audioVideo;

public class Radio extends AudioVideo {

	public Radio(String country, String brand, int power, boolean turnedOn) {
		this.country = country;
		this.brand = brand;
		this.power = power;
		this.turnedOn = turnedOn;
		name = getClass().getName();
	}

	public void changeStation() {
		System.out.println("Station switched!");
	}

	public void searchStations() {
		System.out.println("Search stations completed!");
	}
}
