package exercise3;

public class Department {

	private Person manager;

	public Department(Person person) {
		this.manager = person;
	}

	public Person getManager() {
		return manager;
	}

	// …
}
