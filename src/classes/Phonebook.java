package classes;
import java.util.ArrayList;

public class Phonebook {
	ArrayList<Person2> arrayList;
	
	public Phonebook() {
		arrayList = new ArrayList<Person2>();
	}
	
	public void add(String name, String number) {
		Person2 person;
		arrayList.add(new Person2(name, number));
	}
	
	public void printAll() {
		for (Person2 person : arrayList) {
			System.out.println(person);
		}
	}
	
	public String searchNumber(String name) {
		for (Person2 person : arrayList) {
			if (person.getName().equals(name)) {
				return person.getNumber();
			}
		}
		return "number not known";
		
	}
	
}
