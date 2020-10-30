/**
 * Desc:Java program that checks whether employee class objects contains equal
 * values by overriding equals method.
 * 
 * @author:Suparna date:24/10/2020
 */
class EmployeeClass {

	private String EmpName;
	private String Empdesignation;// private Employee class attributes

	public EmployeeClass(String EmpName, String Empdesignation) {
		this.EmpName = EmpName;
		this.Empdesignation = Empdesignation;

	}

	public boolean equals(Object o) {
		if (!(o instanceof EmployeeClass)) {
			/*
			 * checks whether o is a object of EmployeeClass
			 */
			return false;
		}
		/*
		 * Typecast object o into Employee's object
		 */
		EmployeeClass ec = (EmployeeClass) o;
		/*
		 * Compares both the objects value
		 */
		return EmpName.compareTo(ec.EmpName) == 0 && Empdesignation.compareTo(ec.Empdesignation) == 0;

	}

}

public class OverriddenEqualsClass {
	public static void main(String[] args) {
		/*
		 * Objects of the employee is created
		 */
		EmployeeClass emp = new EmployeeClass("Suparna", "Trainee");
		EmployeeClass emp2 = new EmployeeClass("Rahul", "Trainer");
		EmployeeClass emp3 = new EmployeeClass("Akash", "HR");
		EmployeeClass emp4 = new EmployeeClass("Suparna", "Trainee");
		if (emp.equals(emp4)) {
			System.out.println("Same Employee");
		} else {
			System.out.println("Employees are not same");
		}
	}
}
