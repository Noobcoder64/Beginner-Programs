package packages.classes;
import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover {
	Set<String> characterStrings;
	Integer duplicates;
	
	public PersonalDuplicateRemover() {
		this.characterStrings = new HashSet<String>();
		this.duplicates = 0;
	}
	
	public void add(String characterString) {
		if (this.characterStrings.contains(characterString)) duplicates++;
		this.characterStrings.add(characterString);
	}
	
	public int getNumberOfDetectedDuplicates() {
		return this.duplicates;
	}
	
	public Set<String> getUniqueCharacterStrings()	{
		return this.characterStrings;
	}
	
	public void empty() {
		this.characterStrings.clear();
		this.duplicates = 0;
	}
	
}
