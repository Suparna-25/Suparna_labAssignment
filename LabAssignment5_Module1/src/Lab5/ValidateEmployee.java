package Lab5;

/**
 * This class take user input from an Employee and validates it's full name.
 * 
 * @author Suparna Arya
 *
 */

public class ValidateEmployee {
	public static void main(String[] args) throws InvalidNameException {
		// Employee object is created.
		Employee e = new Employee("1234", "Dhruv", null, "Manager");
		// Prints the Employee value.
		System.out.println("Employee id :" + e.getId());
		System.out.println("Employee name :" + e.getFirstName() + e.getLastName());
		System.out.println("Employee designation :" + e.getDesignation());

	}

}
