package classes;
import java.util.Scanner;

public class TextUserInterface2 {
	Scanner reader;
	Dictionary dictionary;
	
	public TextUserInterface2(Scanner reader, Dictionary dictionary) {
		this.reader = reader;
		this.dictionary = dictionary;
		System.out.println("Statement:");
		System.out.println("	add - adds a word couple to the dictionary\r\n" + 
						   "	translate - asks for a word and prints its translation\r\n" + 
						   "	quit - stops the user interface");

	}
	
	public void start() {
		System.out.println("");
		System.out.print("Statement: ");
		String answer = this.reader.nextLine();
		
		switch (answer) {
			case "add":
				this.add();
			break;
			case "translate":
				this.translate();
			break;
			case "quit":
				System.out.println("Cheers!");
				System.exit(0);
			break;
			default:
				System.out.println("Unknown statement");
			break;
		}
		
		this.start();
	}
	
	public void add() {
		System.out.print("In Finnish: ");
		String word = reader.nextLine();
		System.out.print("Translation: ");
		String translation = reader.nextLine();
		
		dictionary.add(word, translation);
	}
	
	public void translate() {
		System.out.print("Give a word: ");
		String word = reader.nextLine();
		
		System.out.println("Translation: " + dictionary.translate(word));
	}
	
}
