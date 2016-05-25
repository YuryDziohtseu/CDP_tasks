package by.epam.cdp.task_2_1.devices.careEquipment;

public class Hairdryer extends CareEquipment {

	public Hairdryer(String country, String brand, int power, boolean turnedOn) {
		this.country = country;
		this.brand = brand;
		this.power = power;
		this.turnedOn = turnedOn;
		name = getClass().getName();
	}

	public void turnColdAir() {
		System.out.println("Cold air turn on!");
	}

	public void turnHotAir() {
		System.out.println("Hot air turn on!");
	}

}
