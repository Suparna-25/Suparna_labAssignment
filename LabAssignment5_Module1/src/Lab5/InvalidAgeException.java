package Lab5;

public class InvalidAgeException extends Exception {

	/**
	 * This class customized Invalid age exception
	 * 
	 * @author Suparna Arya
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		super();
	}

	public InvalidAgeException(String message) {
		super(message);
	}

}
