package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	List<Person> persons;
	
	public Employees() {
		this.persons = new ArrayList<Person>();
	}
	
	public void add(Person person) {
		this.persons.add(person);
	}
	
	public void add(List<Person> persons) {
		this.persons.addAll(persons);
	}
	
	public void print() {
		Iterator<Person> iterator = persons.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void print(Education education) {
		Iterator<Person> iterator = persons.iterator();
		
		while (iterator.hasNext()) {
			if (iterator.next().getEducation() == education) System.out.println(iterator.next());
		}
	}
	
	public void fire(Education education) {
		Iterator<Person> iterator = persons.iterator();
		
		while (iterator.hasNext()) {
			if (iterator.next().getEducation() == education) iterator.remove();
		}
	}
	
}
