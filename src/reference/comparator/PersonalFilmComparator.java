package reference.comparator;
import java.util.Comparator;
import java.util.Map;

import reference.Film;
import reference.Rating;

public class PersonalFilmComparator implements Comparator<Film>{
	Map<Film, Rating> personalRatings;
	
	public PersonalFilmComparator(Map<Film, Rating> personalRatings) {
		this.personalRatings = personalRatings;
	}
	
	@Override
	public int compare(Film film1, Film film2) {
		return personalRatings.get(film1).getValue() - personalRatings.get(film2).getValue();
	}

}
