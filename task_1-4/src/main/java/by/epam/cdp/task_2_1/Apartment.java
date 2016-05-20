package by.epam.cdp.task_2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import by.epam.cdp.task_2_1.customExceptions.CountryIsNullCustomException;
import by.epam.cdp.task_2_1.devices.Device;

@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class Apartment {

	private List<Device> apartmentDevices;
	public int totalPower;

	public Apartment() {
	}

	public Apartment(List<Device> devices) {
		apartmentDevices = devices;
	}

	public void printApartmentState() {
		for (Device device : apartmentDevices) {
			System.out.println(device);
		}
	}

	public void printDevices(List<Device> devices) {
		for (Device device : devices) {
			System.out.println(device);
		}
	}

	public int getTotalPowerEmbeddedDevices() {
		for (Device device : apartmentDevices) {
			if (device.isTurnedOn()) {
				totalPower = totalPower + device.getPower();
			}
		}
		return totalPower;
	}

	public List<Device> getEmbeddedDevices() {
		List<Device> devices = new ArrayList<Device>();
		for (Device device : apartmentDevices) {
			if (device.isTurnedOn()) {
				devices.add(device);
			}
		}
		return devices;
	}

	public void sortDevicesByPower() {
		Collections.sort(apartmentDevices, new Comparator<Device>() {
			@Override
			public int compare(Device device2, Device device1) {
				Integer power1 = new Integer(device1.getPower());
				Integer power2 = new Integer(device2.getPower());
				return power1.compareTo(power2);
			}
		});
	}

	public List<Device> getDevicesByCountry(String country) throws CountryIsNullCustomException {
		if (country == null) {
			throw new CountryIsNullCustomException("Country is null!");
		}

		List<Device> devices = new ArrayList<Device>();
		for (Device device : apartmentDevices) {
			if (device.getCountry().equals(country)) {
				devices.add(device);
			}
		}
		return devices;
	}

	public List<Device> getApartment() {
		return apartmentDevices;
	}

	public void setApartment(List<Device> apartment) {
		this.apartmentDevices = apartment;
	}

	public int getTotalPower() {
		return totalPower;
	}

	public void setTotalPower(int totalPower) {
		this.totalPower = totalPower;
	}
}
