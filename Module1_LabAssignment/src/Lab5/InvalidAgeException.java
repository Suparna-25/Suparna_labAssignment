package Lab5;

/**
 * This class customized Invalid age exception
 * 
 * @author Suparna Arya
 */

public class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	// user defined exception with no argument constructor
	public InvalidAgeException() {
		super();
	}

	/**
	 * User defined exception with argument constructor
	 * 
	 * @param message
	 */
	public InvalidAgeException(String message) {
		super(message);
	}

}
