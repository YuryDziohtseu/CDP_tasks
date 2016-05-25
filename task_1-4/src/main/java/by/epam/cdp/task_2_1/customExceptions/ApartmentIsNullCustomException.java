package by.epam.cdp.task_2_1.customExceptions;

public class ApartmentIsNullCustomException extends Exception {

	private static final long serialVersionUID = 7521470361276291643L;

	public ApartmentIsNullCustomException(String message) {
		super(message);
	}
}
