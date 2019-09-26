package packages.classes;

public class Hangman {

	public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
	
	Boolean gameOn = true;
	
	public Boolean gameOn() {
		return gameOn;
	}
	
	public void quit() { 
       this.gameOn = false; 
	}
	
	int guesses = 0;
	String unusedLetters = "abcdefghijklmnopqrstuvwxyz";
	
	public void printStatus() {
		if (guesses == 0) {
			System.out.println("You have not made any guesses yet");
		} else {
			System.out.println("You have made " + guesses + " guesses");
		}
		
		System.out.println("Unused letters: " + unusedLetters);
	}
	
	String word = "abbello";
	String guessedLetters = " ";
	int attempts = 0;
	
	public void guess(String letter) {
		if (unusedLetters.contains(letter)) {
			guesses++;
			unusedLetters = unusedLetters.replace(letter, "");
			if (word.contains(letter)) {
				System.out.println("The letter " + letter + " was found in the word!");
				guessedLetters = guessedLetters + letter;
			} else {
				System.out.println("The letter " + letter + " is not in the words.");
				attempts++;
			}
		} else {
			System.out.println("The letter " + letter + " was already used.");
		}
	}
	
	public void printMan() {
		switch (attempts) {
			case 0:
				System.out.println(" ____\r\n |   |\r\n |\r\n |\r\n |\r\n/|\\");	
			break;
			case 1:
				System.out.println(" ____\r\n |   |\r\n |   O\r\n |\r\n |\r\n/|\\");	
			break;
			case 2:
				System.out.println(" ____\r\n |   |\r\n |   O\r\n |   |\r\n |\r\n/|\\");
			break;
			case 3:
				System.out.println(" ____\r\n |   |\r\n |   O\r\n |  /|\r\n |\r\n/|\\");
			break;
			case 4:
				System.out.println(" ____\r\n |   |\r\n |   O\r\n |  /|\\\r\n |\r\n/|\\");
			break;
			case 5:
				System.out.println(" ____\r\n |   |\r\n |   O\r\n |  /|\\\r\n |  /\r\n/|\\");
			break;
			case 6:
				System.out.println(" ____\r\n |   |\r\n |   O\r\n |  /|\\\r\n |  / \\\r\n/|\\");
			break;
		}
		
	}
	
	String guessWord;
	
	public void printWord() {
		 guessWord = word.replaceAll("[^" + guessedLetters + "]", "?");
		System.out.println("Word to be guessed: " + guessWord);
	}
	
	public void checkGame() {
		if (!guessWord.contains("?")) {
			System.out.println("You won!");
			quit();
		} else if (attempts == 6) {
			System.out.println("You lost.");
			quit();
		}
	}
}
