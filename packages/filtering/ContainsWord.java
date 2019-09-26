package packages.filtering;

public class ContainsWord implements Criterion {

	String word;

	public ContainsWord(String word) {
		this.word = word;
	}

	@Override
	public boolean complies(String line) {
		return line.contains(word);
	}
}