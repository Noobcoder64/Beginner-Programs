package packages.filtering;
import java.util.ArrayList;
import java.util.List;

public class Both implements Criterion {
	List<Criterion> criteria;

	public Both(Criterion criterion1, Criterion criterion2) {
		this.criteria = new ArrayList<Criterion>();
		criteria.add(criterion1);
		criteria.add(criterion2);
	}
	
	@Override
	public boolean complies(String line) {
		boolean complies = true;
		for (Criterion criterion : criteria) {
			if (!criterion.complies(line)) complies = false;
		}
		return complies;
	}

}
