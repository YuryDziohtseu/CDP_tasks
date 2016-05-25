package by.epam.cdp.task_2_1.devices.careEquipment;

import by.epam.cdp.task_2_1.devices.Device;

public class CareEquipment extends Device {
	public CareEquipment() {
		type = "CareEquipment";
	}

	public void changeSpeed() {
		System.out.println("Speed changed");
	}
}
