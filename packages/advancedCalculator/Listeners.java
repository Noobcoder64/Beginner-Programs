package packages.advancedCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Listeners {
	private JLabel display;
	private Calculator calculator;
	
	public Listeners(JLabel display) {
		this.display = display;
		calculator = new Calculator();
	}
	
	public ActionListener printToDisplay() {
		ActionListener printToDisplay = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton number = (JButton) e.getSource();
				display.setText(display.getText() + number.getText());			
			}
		};
		return printToDisplay;
	}
	
	public ActionListener clearDisplay() {
		ActionListener clearInputDisplay = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText(" ");
			}
		};
		return clearInputDisplay;
	}
	
	public ActionListener setOperator() {
		ActionListener setOperator = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculator.setFirstNumber(display);
				JButton operator = (JButton) e.getSource();
				calculator.setOperator(operator);
			}
		};
		return setOperator;
	}
	
	public ActionListener calculate() {
		ActionListener calculate = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculator.setSecondNumber(display);
				display.setText(calculator.result() + "");
			}
		};
		return calculate;
	}
	
}
