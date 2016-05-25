package by.epam.cdp.task_2_1.datadataAccess.xmlMarshaller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

import by.epam.cdp.task_2_1.Apartment;
import by.epam.cdp.task_2_1.customExceptions.ApartmentIsNullCustomException;
import by.epam.cdp.task_2_1.datadataAccess.DataAccess;

public class XmlMarshaller implements DataAccess {
	@Override
	public Apartment reqadApartment() {
		Apartment apartment = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Apartment.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			apartment = (Apartment) jaxbUnmarshaller.unmarshal(new File("apartment.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return apartment;
	}

	@Override
	public void writeApartment(Apartment apartment) throws ApartmentIsNullCustomException {
		if (apartment == null) {
			throw new ApartmentIsNullCustomException("Apartment is null!");
		}
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Apartment.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			try {
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			} catch (PropertyException e1) {
				e1.printStackTrace();
			}
			jaxbMarshaller.marshal(apartment, System.out);
			jaxbMarshaller.marshal(apartment, new File("apartment.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
