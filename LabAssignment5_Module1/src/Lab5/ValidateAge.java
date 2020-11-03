package Lab5;

public class ValidateAge {
	/**
	 * This class take user input from a Person and validates it's age.
	 * 
	 * @author Suparna Arya
	 *
	 */

	public static void main(String[] args) throws InvalidAgeException {
		// Person object is created.
		Person p = new Person("Suparna", 8, "Student");
		// Prints the Person's value.
		System.out.println("Name:" + p.getName());
		System.out.println("Age :" + p.getAge());
		System.out.println("Occupation :" + p.getOccupation());

	}

}
