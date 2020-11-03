package Lab5;

/**
 * This class customized Invalid full name exception
 * 
 * @author Suparna Arya
 */
public class InvalidNameException extends Exception {

	private static final long serialVersionUID = 1L;

	// user defined exception with no argument constructor
	public InvalidNameException() {
		super();
	}

	/**
	 * User defined exception with argument constructor
	 * 
	 * @param message
	 */
	public InvalidNameException(String message) {
		super(message);
	}

}
