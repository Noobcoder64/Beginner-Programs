package classes;
import java.util.ArrayList;

public class NumberStatistics {
	ArrayList<Integer> Numbers = new ArrayList<Integer>();
	private int amountOfNumbers;
	private int sum = 0;
	
	public NumberStatistics() {
		
	}
	
	public void addNumber(int Number) {
		this.Numbers.add(Number);
		this.amountOfNumbers++;
	}
	
	public int amountOfNumbers() {
		return this.amountOfNumbers;
	}
	
	public int sum() {
		for (int num : this.Numbers) {
			this.sum = this.sum + num;
		}
		return this.sum;
	}
	
	public double average() {
		return (double) this.sum / this.amountOfNumbers;
	}
	
}
