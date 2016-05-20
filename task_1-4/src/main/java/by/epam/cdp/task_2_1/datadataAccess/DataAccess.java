package by.epam.cdp.task_2_1.datadataAccess;

import by.epam.cdp.task_2_1.Apartment;
import by.epam.cdp.task_2_1.customExceptions.ApartmentIsNullCustomException;

public interface DataAccess {
	public Apartment reqadApartment();

	public void writeApartment(Apartment apartment) throws ApartmentIsNullCustomException;
}
