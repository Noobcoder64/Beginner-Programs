package packages.classes;

public class DecreasingCounter {
	private int value;
	private int initialValue;
	
	
	public DecreasingCounter(int valueAtStart) {
		this.value = valueAtStart;
		this.initialValue = valueAtStart;
	}
	
	public void printValue() {
		System.out.println("value: " + this.value);
	}
	
	public void decrease() {
		if (this.value > 0) {
			this.value--;
		}
	}
	
	public void reset() {
		this.value = 0;
	}
	
	public void setInitial() {
		this.value = this.initialValue;
	}
}
