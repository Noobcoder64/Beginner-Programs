package packages.clicks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Clicker implements ActionListener {
	Calculator calculator;
	JLabel label;
	
	public Clicker(Calculator calculator, JLabel label) {
		this.calculator = calculator;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		calculator.increase();
		label.setText(calculator.getValue());
	}
	
}
