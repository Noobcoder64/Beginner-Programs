package packages.reference.comparator;

import java.util.Comparator;
import java.util.Map;

import packages.reference.Person;

public class PersonComparator implements Comparator<Person> {
	Map<Person, Integer> peopleIdentities;
	
	public PersonComparator(Map<Person, Integer> peopleIdentities) {
		this.peopleIdentities = peopleIdentities;
	}

	@Override
	public int compare(Person person1, Person person2) {
		return this.peopleIdentities.get(person2) - this.peopleIdentities.get(person1);
	}}
