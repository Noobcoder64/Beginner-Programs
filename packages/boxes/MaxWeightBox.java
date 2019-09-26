package packages.boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box {
	private int maxWeight;
	private int currentWeight;
	
	ArrayList<Thing> things; 
	
	public MaxWeightBox(int maxWeight) {
		this.maxWeight = maxWeight;
		this.currentWeight = 0;
		things = new ArrayList<Thing>();
	}

	@Override
	public void add(Thing thing) {
		currentWeight += thing.weight();
		if (currentWeight <= maxWeight) {
			things.add(thing);
		} else {
			currentWeight -= thing.weight();
		}
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		if (things.contains(thing)) return true;
		return false;
	}
	
}
