package classes;
public class Player {
	String name;
	int amountOfGoals;
	
	public Player(String name, int amountOfGoals) {
		this.name = name;
		this.amountOfGoals = amountOfGoals;
	}
	
	public Player(String name) {
		this(name, 0);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int goals() {
		return this.amountOfGoals;
	}
	
	public String toString() {
		return this.name + ", goals " + this.amountOfGoals;
	}
}
