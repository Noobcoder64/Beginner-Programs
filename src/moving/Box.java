package moving;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
	int maximumCapacity;
	List<Thing> things;
	int volume;
	
	public Box(int maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
		things = new ArrayList<Thing>();
	}
	
	public boolean addThing(Thing thing) {
		volume += thing.getVolume();
		if (volume < maximumCapacity) {
			things.add(thing);
			return true;
		}
		volume -= thing.getVolume();
		return false;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}
	
}
