package Lab4;

public class Person {
	private String name;
	private float age;

	public Person(String name, float age)
	{
		this.name = name;
		this.age = age;
	}

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
