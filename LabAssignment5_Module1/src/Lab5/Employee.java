package Lab5;

/**
 * This class contains all attributes of an Employee
 * 
 * @author Suparna Arya
 *
 */
public class Employee {
	private String id;
	private String firstName;
	private String lastName;
	private String designation;

	/**
	 * Employee constructor initializes all the attributes of an Employee class
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param designation
	 * @throws InvalidNameException
	 */
	public Employee(String id, String firstName, String lastName, String designation) throws InvalidNameException {
		this.setId(id);
		if (firstName == null) {
			// It validates the first name of an Employee and checks if it is null then
			// throws user defined exception
			throw new InvalidNameException("First name should not be null");
		} else {
			this.setFirstName(firstName);
		}
		if (lastName == null) {
			// It validates the last name of an Employee and checks if it is null then
			// throws
			// user defined exception
			throw new InvalidNameException("Last name should not be null");
		} else {
			this.setLastName(lastName);
		}
		this.setDesignation(designation);
	}

	// All the setter and getters are described below
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
