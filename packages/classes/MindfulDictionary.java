package packages.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {
	Map<String, String> words = new HashMap<String, String>();
	
	public void add(String word, String translation) {
		if (!this.words.containsKey(word)) {
            this.words.put(word, translation);
        }
	}
	
	public String translate(String word) {
		if (this.words.containsKey(word)) {
            return this.words.get(word);
        } else if (this.words.containsValue(word)) {
            for (String key : this.words.keySet()) {
                if (this.words.get(key).equals(word)){
                    return key;
                }
            }
        }
        return null;
	}
	
	public void remove(String word) {
		if (words.containsKey(word)) {
			words.remove(word);
		} else if (words.containsValue(word)) {
			words.remove(this.translate(word));
		}
	}
	
	String fileName;
	
	public MindfulDictionary(String file) {
		this.fileName = file;
	}
	
	public boolean load() throws FileNotFoundException {
		File file = new File(fileName);
		if (file.canExecute())	{
			Scanner reader = new Scanner(file);
			while (reader.hasNext()) {
				String line = reader.nextLine();
			    String[] parts = line.split(":");
			    words.put(parts[0], parts[1]);
			}
			return true;
		} else {
			return false;
		}
	}
	
	public boolean save() throws IOException {
		File file = new File(fileName);
		if (file.canExecute())	{
			FileWriter writer = new FileWriter(file);
			for (String word : words.keySet()) {
				if (words.containsValue(word)) {
					words.replace(word, null);
				} else {
					writer.write(word + ":" + words.get(word) + "\n");	
				}
			}
			writer.close();
			return true;
		} else {
			return false;
		}
	}
	
}
