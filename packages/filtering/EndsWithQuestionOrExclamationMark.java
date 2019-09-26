package packages.filtering;

public class EndsWithQuestionOrExclamationMark implements Criterion {

	@Override
	public boolean complies(String line) {
		if (line.charAt(line.length() - 1) == '?' || line.charAt(line.length() - 1) == '!') return true;
		return false;
	}

}
