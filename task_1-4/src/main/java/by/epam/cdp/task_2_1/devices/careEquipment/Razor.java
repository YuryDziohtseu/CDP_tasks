package by.epam.cdp.task_2_1.devices.careEquipment;

public class Razor extends CareEquipment {

	public Razor(String country, String brand, int power, boolean turnedOn) {
		this.country = country;
		this.brand = brand;
		this.power = power;
		this.turnedOn = turnedOn;
		name = getClass().getName();
	}

	public void cleanMode() {
		System.out.println("Cleaning mode activated!");
	}
}
