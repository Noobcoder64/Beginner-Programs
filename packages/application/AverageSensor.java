package packages.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
	private List<Sensor> sensors;
	
	public AverageSensor() {
		sensors = new ArrayList<Sensor>();
	}
	
	@Override
	public boolean isOn() {
		boolean state = true;
		for (Sensor sensor : sensors) {
			if(!sensor.isOn()) state = false;
		}
		return state;
	}

	@Override
	public void on() {
		for (Sensor sensor : sensors) {
			sensor.on();
		}
	}

	@Override
	public void off() {
		for (Sensor sensor : sensors) {
			sensor.off();
		}
	}

	@Override
	public int measure() {
		if (this.isOn()) {
			int sum = 0;
			for (Sensor sensor : sensors) sum += sensor.measure();
			return sum / sensors.size();
		}
		throw new IllegalStateException("The average sensor is off");
	}
	
	public void addSensor(Sensor additional) {
		sensors.add(additional);
	}
	
	public List<Integer> readings()	{
		List<Integer> readings = new ArrayList<Integer>();
		for (Sensor sensor : sensors) readings.add(sensor.measure());
		return readings;
	}

}
