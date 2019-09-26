package classes;
public class Person2 {
	private String name;
	private String number;
	
	public Person2(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public String toString() {
		return name + " number: " + number;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public void changeNumber(String newNumber) {
		this.number = newNumber;
	}
}
