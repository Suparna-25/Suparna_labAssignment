package Lab5;

/**
 * This class contains all attributes of a Person
 * 
 * @author Suparna Arya
 *
 */
public class Person {
	private String name;
	private int age;
	private String occupation;

	/**
	 * Person constructor initializes all the attributes of a Person class
	 * 
	 * @param name
	 * @param age
	 * @param occupation
	 * @throws InvalidAgeException
	 */
	public Person(String name, int age, String occupation) throws InvalidAgeException {
		this.name = name;
		if (age <= 15) {// It validates the age of a Person and checks if it is less than equal to 15
						// then throws user defined exception
			throw new InvalidAgeException("Age must be greater than 15");
		} else {
			this.age = age;
		}
		this.occupation = occupation;
	}

	// All the setter and getters are described below
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
