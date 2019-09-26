package packages.classes;

public class BoundedCounter {
	int value = 0;
	int upperLimit;
	
	public BoundedCounter (int upperLimit) {
		this.upperLimit = upperLimit;
	}
	
	public String toString() {
		if (this.value < 10) {
			return "0" + this.value;
		}
		return "" + this.value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		if (!(value < 0 || value > this.upperLimit)) {
			this.value = value;
		}
	}
	
	public void next() {
		if (this.value < this.upperLimit) {
			this.value++;
		} else {
			this.value = 0;
		}
	}
}
