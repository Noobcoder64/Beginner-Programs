package packages.moving;

public class Item implements Thing, Comparable<Thing> {
	String name;
	int volume;
	
	public Item(String name, int volume) {
		this.name = name;
		this.volume = volume;
	}
	
	@Override
	public int getVolume() {
		return this.volume;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name + " (" + this.volume + " dm^3)";
	}

	@Override
	public int compareTo(Thing thing) {
		return this.volume - thing.getVolume();
	}
	
}
