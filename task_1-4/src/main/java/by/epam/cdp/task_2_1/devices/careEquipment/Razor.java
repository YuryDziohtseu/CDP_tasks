package by.epam.cdp.task_2_1.devices.careEquipment;

public class Razor extends CareEquipment {

	public Razor(String country1, String brand1, int power1, boolean turnedOn1) {
		country = country1;
		brand = brand1;
		power = power1;
		turnedOn = turnedOn1;
		device = "Razor";
		type = this.type;
	}

	public void cleanMode() {
		System.out.println("Cleaning mode activated!");
	}
}
