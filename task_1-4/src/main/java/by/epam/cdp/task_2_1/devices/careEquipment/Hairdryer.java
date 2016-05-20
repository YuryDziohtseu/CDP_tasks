package by.epam.cdp.task_2_1.devices.careEquipment;

public class Hairdryer extends CareEquipment {

	public Hairdryer(String country1, String brand1, int power1, boolean turnedOn1) {
		country = country1;
		brand = brand1;
		power = power1;
		turnedOn = turnedOn1;
		device = "Hairdryer";
		type = this.type;
	}

	public void turnColdAir() {
		System.out.println("Cold air turn on!");
	}

	public void turnHotAir() {
		System.out.println("Hot air turn on!");
	}

}
