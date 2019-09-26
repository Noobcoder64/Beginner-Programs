package classes;

public class CD implements ToBeStored {
	private String artist;
	private String title;
	private int publishingYear;
	private double weight;
	
	public CD(String artist, String title, int publishingYear) {
		this.artist = artist;
		this.title = title;
		this.publishingYear = publishingYear;
		this.weight = 0.1;
	}
	
	public String toString() {
		return this.artist + ": " + this.title + " (" + this.publishingYear + ")"; 
	}
	
	public double weight() {
		return weight;
	}
}
