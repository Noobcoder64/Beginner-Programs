package classes;
public class Book2 {
	private String title;
	private String publisher;
	private int year;

	public Book2(String title, String publisher, int year) {
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	
	public String title() {
		return this.title;
	}
	
	public String publisher() {
		return this.publisher;
	}
	
	public int year() {
		return this.year;
	}
	
	public String toString() {
		return this.title + ", " + this.publisher + ", " + this.year;
	}
	
	@Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Book2 compared = (Book2) object;

        if (this.year != compared.year()) {
            return false;
        }

        if (this.title == null || !this.title.equals(compared.title())) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        if (this.title == null) {
            return 7;
        }

        return this.year + this.title.hashCode();
    }
}
