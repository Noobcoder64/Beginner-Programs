package classes;
public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;      
		this.year = year;
	}

	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean earlier(MyDate compared) {
		// first we'll compare years
		if ( this.year < compared.year ) {
			return true;
		}

		// if the years are the same, we'll compare the months
		if ( this.year == compared.year && this.month < compared.month ) {
			return true;
		}

		// years and months the same, we'll compare the days
		if ( this.year == compared.year && this.month == compared.month &&
				this.day < compared.day ) {
			return true;
		}
		return false;
	}
	
	public void advance() {
		this.day++;
		if (this.day > 30) {
			this.day = 1;
			this.month++;
			
			if (this.month > 12) {
				this.month = 1;
				this.year++;
			}
		}
	}
	
	public void advance(int numberOfDays) {
		for (int i = 0; i < numberOfDays; i++) {
			this.advance();
		}
	}
	
	public MyDate afterNumberOfDays(int days) {
		MyDate newMyDate = new MyDate(this.day, this.month, this.year);
		newMyDate.advance(days);
		return newMyDate;
	}
	
	public int differenceInYears(MyDate comparedDate) {
		MyDate afterDate = this;
		MyDate beforeDate = this;
		
		if (this.earlier(comparedDate)) {
			afterDate = comparedDate;
		} else {
			beforeDate = comparedDate;
		}
		
		int years = afterDate.year - beforeDate.year - 1;
		int months = (11 - beforeDate.month) + afterDate.month + (12 * years);
		int days = (30 - beforeDate.day) + afterDate.day + (months * 30);
		
		return days / 360;
	}
	
}
