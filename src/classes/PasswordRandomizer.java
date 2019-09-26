package classes;
import java.util.Random;

public class PasswordRandomizer {
	Random random;
	int length;
	String symbols = "abcdefghijklmnopqrstuvwxyz";
	
	public PasswordRandomizer(int length) {
		this.length = length;
		random = new Random();
	}
	
	public String createPassword() {
		String password = "";
		int symbolsLength = symbols.length();

		for (int i = 0; i < length; i++) {
			int randomNumber = random.nextInt(symbolsLength);
			password = password + symbols.charAt(randomNumber);
		}
		return password;
	}
	
}
