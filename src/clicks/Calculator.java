package clicks;

public class Calculator {
	private int value;
	
	public Calculator() {
		this.value = 0;
	}
	
	public void increase() {
		this.value++;
	}
	
	public String getValue() {
		return this.value + "";
	}
	
}
