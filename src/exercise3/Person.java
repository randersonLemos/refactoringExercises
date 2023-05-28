package exercise3;

public class Person {

	private Department department;

	public Person(Department department) {
		this.department = department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Person getManager() {
		return this.department.getManager();
	}

}
