package filtering;

public class AllLines implements Criterion {

	public AllLines() {}
	
	@Override
	public boolean complies(String line) {
		return true;
	}	
}
