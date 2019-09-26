package packages.containers;

public class Container {
	private double capacity;
	private double volume;
	
	public Container(double capacity) {
		if (capacity <= 0) {
			this.capacity = 0;
		} else {
			this.capacity = capacity;
		}
	}
	
	public double getVolume() {
		return this.volume;
	}
	
	public double getOriginalCapacity() {
		return this.capacity;
	}
	
	public double getCurrentCapacity() {
		return this.capacity - this.volume;
	}
	
	public void addToTheContainer(double amount) {
		if (amount <= 0) return;
		volume += amount;
		if (volume > capacity) volume = capacity;
		}
	
	public double takeFromTheContainer(double amount) {
		if (amount <= 0) return 0;
		if (amount > capacity) {
			volume = 0;
			return capacity;
		} else {
			volume -= amount;
			return amount;
		}
	}
	
	public String toString() {
		return "volume = " + this.volume + ", free space " + String.format( "%.1f", getCurrentCapacity());
	}
	
}
