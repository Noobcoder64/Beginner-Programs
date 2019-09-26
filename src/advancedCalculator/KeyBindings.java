package advancedCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class KeyBindings {
	JButton[] numberButtons;
	HashMap<String, JButton> operatorButtons;
	
	public KeyBindings(JButton[] numberButtons, HashMap<String, JButton> operatorButtons) {
		this.numberButtons = numberButtons;
		this.operatorButtons = operatorButtons;
		
		bindNumbers();
		bindOperators();
	}

	private void bindNumbers() {
		for (int i = 0; i < 10; i++) {
			String number = String.valueOf(i); 
			applyMapNumber(numberButtons[i], number);
		}
	}
	
	private void applyMapNumber(JButton numberButton, String number) {
		InputMap inputMap = numberButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(number), "pressButton");
		inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + number), "pressButton");
		numberButton.getActionMap().put("pressButton", this.pressButton());
	}
	
	private void bindOperators() {
		applyMapOperator(operatorButtons.get("add"), KeyEvent.VK_ADD);
		applyMapOperator(operatorButtons.get("subtract"), KeyEvent.VK_SUBTRACT);
		applyMapOperator(operatorButtons.get("multiply"), KeyEvent.VK_MULTIPLY);
		applyMapOperator(operatorButtons.get("divide"), KeyEvent.VK_DIVIDE);
		applyMapOperator(operatorButtons.get("equal"), KeyEvent.VK_ENTER);
		applyMapOperator(operatorButtons.get("dot"), KeyEvent.VK_DECIMAL);
	}
	
	private void applyMapOperator(JButton operator, int keyEvent) {
		InputMap inputMap = operator.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(keyEvent, 0), "pressButton");
		operator.getActionMap().put("pressButton", this.pressButton());
	}
	
	public Action pressButton() {
		@SuppressWarnings("serial")
		Action pressButton = new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				button.doClick();
			}
		};
		return pressButton;
	}
	
	public JButton[] getNumberButtons() {
		return numberButtons;
	}
	
	public HashMap<String, JButton> getOperatorButtons() {
		return operatorButtons;
	}
	
}
