package exercise3;

//
// CODE SMELL
// DISPENSABLE and OBJECT-ORIENTATION ABUSERS
//


public class App {

	public static void main(String[] args) {

		Person john = new Person( new Department('Rafael') );
		
		Person manager = john.getManager();
	}
}
