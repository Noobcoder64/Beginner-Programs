package advancedCalculator;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InnerComponents {
	private JLabel display;
	private JButton[] numberButtons;
	private HashMap<String, JButton> operatorButtons;
	
	private Listeners listeners;
	
	public InnerComponents() {
		this.createDisplay();
		
		listeners = new Listeners(display);
		
		this.createNumberButtons();
		this.createOperatorButtons();
		
		this.addKeyBindings();	
	}

	public void createDisplay() {
		this.display = new JLabel(" ");
		display.setFont(new Font("Calibri", Font.BOLD, 25));
		display.setOpaque(true);
		display.setBackground(Color.white);
		display.setBorder(new EmptyBorder(0,0,0,20));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
	}
	
	public void createNumberButtons() {
		this.numberButtons = new JButton[10];
		
		for (int i = 0; i < 10; i++) {
			String number = String.valueOf(i);
			
			JButton button = new JButton(number);
			button.addActionListener(listeners.printToDisplay());
			
			applyStyle(button, Color.white);
			
			this.numberButtons[i] = button;
		}
	}
	
	public void createOperatorButtons() {
		this.operatorButtons = new HashMap<String, JButton>();

		operatorButtons.put("add", new JButton("+"));
		
		operatorButtons.put("subtract", new JButton("-"));
		
		operatorButtons.put("multiply", new JButton("X"));
		
		operatorButtons.put("divide", new JButton("/"));
		
		for (JButton operator : this.operatorButtons.values()) {
			operator.addActionListener(listeners.clearDisplay());
			operator.addActionListener(listeners.setOperator());
			
			applyStyle(operator, Color.lightGray);
		}
		
		operatorButtons.put("equal", new JButton("="));
		operatorButtons.get("equal").addActionListener(listeners.calculate());
		
		operatorButtons.put("dot", new JButton("."));
		operatorButtons.get("dot").addActionListener(listeners.printToDisplay());
		
		applyStyle(operatorButtons.get("equal"), Color.orange);
		
		applyStyle(operatorButtons.get("dot"), Color.lightGray);
		
	}
	
	private void addKeyBindings() {
		KeyBindings keyBindings = new KeyBindings(numberButtons, operatorButtons);
		this.numberButtons = keyBindings.getNumberButtons();
		this.operatorButtons = keyBindings.getOperatorButtons();
	}
	
	private void applyStyle(JButton button, Color backgroundColor) {
		button.setFont(new Font("Calibri", Font.BOLD, 25));
		button.setBackground(backgroundColor);
		button.setBorder(BorderFactory.createLineBorder(Color.darkGray));
	}
	
	public JLabel display() {
		return this.display;
	}
	
	public JButton[] numberButtons() {
		return this.numberButtons;
	}
	
	public HashMap<String, JButton> operators() {
		return this.operatorButtons;
		
	}
	
	
	
}
