package containers;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {
	private ArrayList<Double> containerHistory;
	
	public ContainerHistory() {
		containerHistory = new ArrayList<Double>();
	}
	
	public void add(double situation) {
		containerHistory.add(situation);
	}
	
	public void reset() {
		containerHistory.clear();
	}
	
	public String toString() {
		return containerHistory + "";
	}
	
	public double maxValue() {
		return Collections.max(containerHistory);
	}
	
	public double minValue() {
		return Collections.min(containerHistory);
	}
	
	public double average() {
		double sum = 0;
		for (Double amount : containerHistory) sum += amount;
		return sum / containerHistory.size();
	}
	
	public double greatestFluctuation() {
		double largest = 0;
		
		for (int i = 0; i < containerHistory.size() - 1; i++) {
			double fluctuation = Math.abs(containerHistory.get(i) - containerHistory.get(i + 1));
			if (fluctuation > largest)	largest = fluctuation;
		}

		return largest;
	}
    
    public double variance() {
    	double average = average();
    	double temp = 0;
    	for(double amount : containerHistory)
    	   temp += (amount-average)*(amount-average);
    	return temp/(containerHistory.size()-1);	
    }
}
