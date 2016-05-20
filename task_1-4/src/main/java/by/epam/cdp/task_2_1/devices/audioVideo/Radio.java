package by.epam.cdp.task_2_1.devices.audioVideo;

public class Radio extends AudioVideo {

	public Radio(String country1, String brand1, int power1, boolean turnedOn1) {
		country = country1;
		brand = brand1;
		power = power1;
		turnedOn = turnedOn1;
		device = "Radio";
		type = this.type;
	}

	public void changeStation() {
		System.out.println("Station switched!");
	}

	public void searchStations() {
		System.out.println("Search stations completed!");
	}
}
