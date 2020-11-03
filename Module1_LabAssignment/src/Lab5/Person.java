package Lab5;

/**
 * This class contains all attributes of a Person
 * 
 * @author Suparna Arya
 *
 */
public class Person {
	// All the features of a Person is described below
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
		this.setName(name);
		if (age <= 15) {
			// It validates the age of a person if it is less than 15 it throws user defined
			// exception
			throw new InvalidAgeException("Age must be greater than 15");
		} else {
			this.setAge(age);
		}
		this.setOccupation(occupation);
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
