package by.epam.cdp.task_2_1.devices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "device")
@XmlAccessorType (XmlAccessType.FIELD)
public class Device {

	protected String name;
	protected String brand;
	protected String type;
	protected String country;
	protected int power;
	protected boolean turnedOn;

	public Device() {
		turnedOn = false;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}

	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}

	@Override
	public String toString() {
		return "Device [name=" + name + ", brand=" + brand + ", type=" + type + ", country=" + country + ", power="
				+ power + ", turnedOn=" + turnedOn + "]";
	}
}
