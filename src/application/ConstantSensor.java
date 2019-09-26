package application;

public class ConstantSensor implements Sensor {
	private int number;
	
	public ConstantSensor(int number) {
		this.number = number;
	}
	
	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public void on() {}

	@Override
	public void off() {}

	@Override
	public int measure() {
		return this.number;
	}

}
