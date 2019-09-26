package application;

import java.util.Random;

public class Thermometer implements Sensor {
	private boolean state;
	
	@Override
	public boolean isOn() {
		return state;
	}

	@Override
	public void on() {
		this.state = true;
	}

	@Override
	public void off() {
		this.state = false;
	}

	@Override
	public int measure() {
		
		if (state) {
			Random random = new Random();
			int ranNo = random.nextInt(61) -30;
			return ranNo;
		}
		throw new IllegalStateException("The thermometer is off");
	}

}
