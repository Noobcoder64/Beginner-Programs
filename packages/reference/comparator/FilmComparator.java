package packages.reference.comparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import packages.reference.Film;
import packages.reference.Rating;

public class FilmComparator implements Comparator<Film>{
	Map<Film, List<Rating>> ratings;
	
	public FilmComparator(Map<Film, List<Rating>> ratings) {
		this.ratings = ratings;
	}
	
	@Override
	public int compare(Film film1, Film film2) {
		return getAverage(film1) - getAverage(film2);
	}
	
	private int getAverage(Film film) {
		List<Rating> filmRatings = new ArrayList<>(ratings.get(film));
		int sum = 0;
		for (Rating rating : filmRatings) {
			sum += rating.getValue();
		}
		return sum / filmRatings.size();
	}

}
