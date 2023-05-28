package exercise4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;

//
// CODE SMELL
// BLOATERS AND DISPENSABLES
//

public class App {

	public static void main(String[] args) {
		// Client code
		Person kent = new Person();
		Set s = new HashSet();
		s.add(new Course("MC426", false));
		s.add(new Course("MC646", true));
		s.add(new Course("MC536", false));
		kent.setCourses(s);
		
		Iterator iter = kent.getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) {
				count++;
			}
		}
		System.out.print("Advanced courses: " + count);
	}

}