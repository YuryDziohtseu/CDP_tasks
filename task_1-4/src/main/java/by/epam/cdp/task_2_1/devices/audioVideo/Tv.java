package by.epam.cdp.task_2_1.devices.audioVideo;

public class Tv extends AudioVideo {
	public Tv(String country, String brand, int power, boolean turnedOn) {
		this.country = country;
		this.brand = brand;
		this.power = power;
		this.turnedOn = turnedOn;
		name = getClass().getName();
	}

	public void changeChannel() {
		System.out.println("Channel switched!");
	}

	public void searchChannel() {
		System.out.println("Search channels completed!");
	}

}
