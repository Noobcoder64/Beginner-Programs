package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {
	Map<Film, List<Rating>> ratings;
	Map<Person, Map<Film, Rating>> personalRatings;
	
	public RatingRegister() {
		this.ratings = new HashMap<Film, List<Rating>>();
		this.personalRatings = new HashMap<Person, Map<Film, Rating>>();
	}
	
	public void addRating(Film film, Rating rating) {
	if (!this.ratings.containsKey(film)) this.ratings.put(film, new ArrayList<Rating>());
	this.ratings.get(film).add(rating);
	}
	
	public List<Rating> getRatings(Film film) {
		return this.ratings.get(film);
	}
	
	public Map<Film, List<Rating>> filmRatings() {
		return this.ratings;
	}
	
	public void addRating(Person person, Film film, Rating rating) {
		if (!this.personalRatings.containsKey(person)) this.personalRatings.put(person, new HashMap<Film, Rating>());
		if (!this.personalRatings.get(person).containsKey(film)) this.personalRatings.get(person).put(film, rating);
		addRating(film, rating);
	}
	
	public Rating getRating(Person person, Film film) {
		Rating rating = this.personalRatings.get(person).get(film);
		if (rating == null) return Rating.NOT_WATCHED;
		return rating;
	}
	
	public Map<Film, Rating> getPersonalRatings(Person person) {
		return this.personalRatings.get(person);
	}
	
	public List<Person> reviewers() {
		return new ArrayList<Person>(this.personalRatings.keySet());
	}
	
	public List<Film> getFilms() {
		return new ArrayList<Film>(this.ratings.keySet());
	}
	
}
