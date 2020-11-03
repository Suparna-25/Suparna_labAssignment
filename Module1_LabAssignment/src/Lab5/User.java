package Lab5;

/**
 * This class take user input of a person and validates it's age.
 * 
 * @author Suparna Arya
 *
 */
public class User {

	public static void main(String[] args) throws InvalidAgeException {
		// Person object is created.
		Person p = new Person("Suparna Arya", 8, "Student");
		// Prints the Person value.
		System.out.println("Name " + p.getName());
		System.out.println("Age " + p.getName());
		System.out.println("Occupation " + p.getName());

	}

}
