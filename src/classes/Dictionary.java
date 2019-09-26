package classes;
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
	HashMap<String, String> words;
	int amountOfWords;
	
	public Dictionary() {
		words = new HashMap<String, String>();
	}
	
	public String translate(String word) {
		if (this.words.get(word) == null) return "Unknown word!";
		return this.words.get(word);
	}
	
	public void add(String word, String translation) {
		this.words.put(word, translation);
	}
	
	public int amountOfWords() {
		return amountOfWords;
	}
	
	public ArrayList<String> translationList() {
		ArrayList<String> arrayList = new ArrayList<String>(); 
		for (String i : this.words.keySet()) {
			arrayList.add(i + " = " + words.get(i));
		}
		return arrayList;
	}
	
}
