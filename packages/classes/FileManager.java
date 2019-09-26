package packages.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

	public ArrayList<String> read(String fileName) throws FileNotFoundException{
		File file = new File(fileName);
		Scanner reader = new Scanner(file);
		ArrayList<String> lines = new ArrayList<String>();
		while (reader.hasNextLine()) {
			lines.add(reader.nextLine());
		}
		return lines;
	}
	
	 public void save(String file, ArrayList<String> texts) throws Exception {
		 FileWriter writer = new FileWriter(file, true);
		 for (String text : texts) {
			writer.write(text);
			writer.write("\n");
		}
		 writer.close();
	 }
	
}
