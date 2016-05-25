package by.epam.cdp.task_2_1.devices.audioVideo;

import by.epam.cdp.task_2_1.devices.Device;

public class AudioVideo extends Device {
	public AudioVideo() {
		type = "AudioVideo";
	}

	public void VolumeUp() {
		System.out.println("Volume increased");
	}

	public void VolumeLow() {
		System.out.println("Volume reduced");
	}
}
