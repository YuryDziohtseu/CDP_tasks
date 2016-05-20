package by.epam.cdp.task_2_1.devices.audioVideo;

public class Tv extends AudioVideo {
	public Tv(String country1, String brand1, int power1, boolean turnedOn1) {
		country = country1;
		brand = brand1;
		power = power1;
		turnedOn = turnedOn1;
		device = "TV";
		type = this.type;
	}

	public void changeChannel() {
		System.out.println("Channel switched!");
	}

	public void searchChannel() {
		System.out.println("Search channels completed!");
	}

}
