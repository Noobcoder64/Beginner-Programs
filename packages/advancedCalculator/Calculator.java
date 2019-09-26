package packages.advancedCalculator;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Calculator {
	private double firstNumber;
	private double secondNumber;
	private String operator;
	
	public Calculator() {
		this.firstNumber = 0;
		this.secondNumber = 0;
	}
	
	public double add() {
		double result = firstNumber + secondNumber;
		return result;
	}
	
	public double subtract() {
		double result = firstNumber - secondNumber;
		return result;
	}
	
	public double multiply() {
		double result = firstNumber * secondNumber;
		return result;
	}
	
	public double divide() {
		double result = firstNumber / secondNumber;
		return result;
	}
	
	public void setFirstNumber(JLabel display) {
		this.firstNumber = Double.parseDouble((display.getText().trim()));
	}
	
	public void setSecondNumber(JLabel display) {
		this.secondNumber = Double.parseDouble((display.getText().trim()));
	}
	
	public void setOperator(JButton operator) {
		this.operator = operator.getText();
	}
	
	public double result() {
		switch (this.operator) {
		case "+":
			return add();
		case "-":
			return subtract();
		case "X":
			return multiply();
		case "/":
			return divide();
		}
		return 0;
	}
	
}
