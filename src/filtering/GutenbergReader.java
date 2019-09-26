package filtering;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GutenbergReader {
	private List<String> lines;

    public GutenbergReader() throws FileNotFoundException {
        this.lines = new ArrayList<String>();
        @SuppressWarnings("resource")
		Scanner reader = new Scanner(new File("src/filtering.txt"));
        
        while (reader.hasNext()) {
        	lines.add(reader.nextLine());
        }
    }

    public List<String> linesWhichComplyWith(Criterion c){
        List<String> complyingLines = new ArrayList<String>();

        for (String line : lines) {
            if (c.complies(line)) {
                complyingLines.add(line);
            }
        }

        return complyingLines;
    }
}
