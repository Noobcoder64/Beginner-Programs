package packages.classes;
import java.util.Random;

public class Dice {
	private Random random;
	private int numberOfSides;
	
	public Dice(int numberOfSides) {
		this.numberOfSides = numberOfSides;
		random = new Random();
	}
	
	public int roll() {
		return random.nextInt(numberOfSides) + 1;
	}
}
