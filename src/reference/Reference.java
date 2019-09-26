package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import reference.comparator.FilmComparator;
import reference.comparator.PersonalFilmComparator;

public class Reference {
	RatingRegister ratingRegister;
	
	public Reference(RatingRegister ratingRegister) {
		this.ratingRegister = ratingRegister;
	}
	
 	public Film recommendFilm(Person person) {
 		if (ratingRegister.getPersonalRatings(person) == null)
		return Collections.max(ratingRegister.getFilms(), new FilmComparator(ratingRegister.filmRatings()));
		Map<Film, Rating> personalRatings = ratingRegister.getPersonalRatings(person);
		List<Person> reviewers = ratingRegister.reviewers();
		int mostSimilarity = 0;
		Person mostSimilar = null;
		
		for (Person reviewer : reviewers) {
			if (reviewer.equals(person)) continue;
			int similarity = 0;
			for (Film film : personalRatings.keySet()) {
				similarity += personalRatings.get(film).getValue() * ratingRegister.getRating(reviewer, film).getValue();
			}
			
			if (similarity > mostSimilarity) {
				mostSimilarity = similarity;
				mostSimilar = reviewer;
			}	
		}
		
		if (mostSimilar == null) return Collections.max(ratingRegister.getFilms(), new FilmComparator(ratingRegister.filmRatings()));
		
		Map<Film, Rating> similarRating = new HashMap<Film, Rating>(ratingRegister.getPersonalRatings(mostSimilar));
		
		Film recommended;
		while (true) {
			recommended = Collections.max(similarRating.keySet(), new PersonalFilmComparator(similarRating));
			if (!personalRatings.containsKey(recommended)) break;
			similarRating.remove(recommended);
		}
		return recommended;
	}
}
	
