package classes;
public class Clock {
	private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
    
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
    	hours = new BoundedCounter(23);
    	minutes = new BoundedCounter(59);
    	seconds = new BoundedCounter(59);
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
    	this.seconds.next();
    	if (this.seconds.getValue() == 0) {
    		this.minutes.next();
    		if (this.minutes.getValue() == 0) {
    			this.hours.next();
    		}
    	}
    }
    
    public String toString() {
		return hours + ":" + minutes + ":" + seconds;
    }
}
