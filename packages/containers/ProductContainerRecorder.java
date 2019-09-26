package packages.containers;

public class ProductContainerRecorder extends ProductContainer {
	ContainerHistory containerHistory;
	
	public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
		super(productName, capacity);
		containerHistory = new ContainerHistory();
		this.addToTheContainer(initialVolume);
	}
	
	public String history() {
		return containerHistory.toString();
	}
	
	public void addToTheContainer(double amount) {
		super.addToTheContainer(amount);
		containerHistory.add(super.getVolume());
	}
	
	public double takeFromTheContainer(double amount) {
		double takenAmount = super.takeFromTheContainer(amount);
		containerHistory.add(super.getVolume());
		return takenAmount;
	}
	
	public void printAnalysis() {
		toString();
		System.out.println(history());
		System.out.println("Greatest product amount: " + containerHistory.maxValue());
		System.out.println("Smallest  product amount: " + containerHistory.minValue());
		System.out.println("Average: " + containerHistory.average());
		System.out.println("Greatest change: " + containerHistory.greatestFluctuation());
		System.out.println("Variance: " + containerHistory.variance());
	}
	
}
