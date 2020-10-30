/**
 * Desc: This class holds all the  details of a person
 * @ author-Suparna Arya
 */
package Lab4;

public class Person {
	/*
	 * This variable defines person name
	 */
	private String name;
	/*
	 * This variable defines person name
	 */
	private float age;

	
	/*
	 * This constructor initialize all the attributes of person class
	 */
	public Person(String name, float age)
	{
		this.name = name;
		this.age = age;
	}
	/*
	 * All the setters and getters are described below
	 */
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setAge(float age) {
		this.age = age;
	}
	float getAge() {
		return age;
	}

}
