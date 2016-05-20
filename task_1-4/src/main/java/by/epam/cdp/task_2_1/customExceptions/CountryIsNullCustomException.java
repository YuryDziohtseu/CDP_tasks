package by.epam.cdp.task_2_1.customExceptions;

public class CountryIsNullCustomException extends Exception {

	private static final long serialVersionUID = 4646789825116885722L;

	public CountryIsNullCustomException(String message)
	  {
	    super(message);
	  }
}
