package moving.logic;

import java.util.ArrayList;
import java.util.List;

import moving.*;

public class Packer {
	int boxesVolume;
	
	public Packer(int boxesVolume) {
		this.boxesVolume = boxesVolume;
	}
	
	public List<Box> packThings(List<Thing> things) {
		List<Box> boxes = new ArrayList<Box>();
		boolean added = true;
		Box box = new Box(boxesVolume); 

		while (!things.isEmpty()) {
			added = box.addThing(things.get(0));
			if (added) things.remove(0);
			if (!added || things.isEmpty()) {
				boxes.add(box);
				box = new Box(boxesVolume);
			}
		}
		return boxes;
	}
	
}
