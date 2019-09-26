package classes;
import java.util.ArrayList;

public class Changer {
	ArrayList<Change> changes;
	
	public Changer() {
		changes = new ArrayList<Change>();
	}
	
	public void addChange(Change change) {
		 changes.add(change);
	}
	
	public String change(String characterString) {
		for(Change change : changes) {
			characterString = change.change(characterString);
		}
		return characterString;
	}
}
