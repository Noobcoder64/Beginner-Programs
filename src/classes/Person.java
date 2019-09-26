package classes;
import java.util.Calendar;

public class Person {
	private String name;
	private int age;
	private int weight;
	private int height;
	private MyDate birthMyDate;
	private static MyDate currentDate = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
	
	public Person(String name) {
		this(name, currentDate);
	}
	
//	public Person(String name, int age, int height, int weight) {
//	    this.name = name;
//	    this.age = age;
//	    this.height = height;
//	    this.weight = weight;
//	}
	
	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.age = 0;
		this.height = 0;
		this.weight = 0;
		this.birthMyDate = new MyDate(day, month, year);
	}
	
	public Person(String name, MyDate birthMyDate) {
	        this.name = name;
	        this.weight = 0;
	        this.height = 0;
	        this.birthMyDate = birthMyDate;
	}
	
	public int age() {
		return birthMyDate.differenceInYears(this.currentDate);
	}
	 
	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setHeight(int newHeight) {
		this.height = newHeight;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public double bodyMassIndex() {
		double heightDividedByHundred = this.height / 100.0;
        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
	}
	
	
	// public void printPerson() {
		// System.out.println(this.name + ", age " + this.age + " years");
	// }
	
	// Recommended
//	public String toString() {
//		return this.name + ", age " + this.age + " years, my body mass index is " + String.format( "%.2f", this.bodyMassIndex());
//	}
	
	public String toString() {
	    return this.name + ", born " + this.birthMyDate;
	}
	
	public void becomeOlder() {
	    this.becomeOlder(1);
	}

	public void becomeOlder(int years) {
	    this.age = this.age + years;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean isAdult() {
		return this.age >= 18;
	}
	
	public boolean olderThan(Person compared) {
		if (this.birthMyDate.earlier(compared.birthMyDate)) return true;
		return false;
	}
}
