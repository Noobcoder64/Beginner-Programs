package packages.classes;
import java.io.File;
import java.util.Scanner;

public class Analysis {
	private File file;
	
	public Analysis (File file) throws Exception {
		this.file = file;
	}
	
	public int lines() throws Exception {
		Scanner reader = new Scanner(file);
		int lines = 0;
		while (reader.hasNextLine()) {
			reader.nextLine();
			lines++;
		}
		reader.close();
		return lines;
	}
	
	public int characters() throws Exception {
		Scanner reader = new Scanner(file);
		int characters = 0;
		while (reader.hasNext()) { 
			characters += reader.next().toCharArray().length;
		}
		reader.close();
		return characters;
	}
	
}
