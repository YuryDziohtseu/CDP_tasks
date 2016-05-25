package by.epam.cdp.task_2_1;

import by.epam.cdp.task_2_1.customExceptions.CountryIsNullCustomException;
import by.epam.cdp.task_2_1.datadataAccess.xmlMarshaller.XmlMarshaller;

public class App {
	public static void main(String[] args) {
		
		XmlMarshaller xmlMarshaller = new XmlMarshaller();
		Apartment apartment = xmlMarshaller.reqadApartment();
		
		apartment.printApartmentState();
		
		System.out.println("-------------Sorted by power devices:----------------");
		apartment.sortDevicesByPower();
		apartment.printApartmentState();
		
		System.out.println("-------------Total devices power:----------------");
		System.out.println(apartment.getTotalPower());
		
		System.out.println("-------------Get devices by country:----------------");
		try {
			apartment.printDevices(apartment.getDevicesByCountry("China"));
		} catch (CountryIsNullCustomException e) {
			e.printStackTrace();
		} 
	}
}
