package packages.people;

public class Student extends Person {
	private int credits;
	
	public Student(String name, String address) {
		super(name, address);
		this.credits = 0;
	}
	
	public int credits() {
		return this.credits;
	}
	
	public void study() {
		this.credits++;
	}
	
	public String toString() {
		return super.toString() + "\ncredits " + this.credits;
	}
}
