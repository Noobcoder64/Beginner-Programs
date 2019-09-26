package filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AtLeastOne implements Criterion {
	List<Criterion> criteria;
	
	public AtLeastOne(Criterion...criteria) {
		this.criteria = new ArrayList<Criterion>(Arrays.asList(criteria));
	}
	
	@Override
	public boolean complies(String line) {
		boolean complies = false;
		for (Criterion criterion : criteria) {
			if (criterion.complies(line)) complies = true;
		}
		return complies;
	}
	
}
