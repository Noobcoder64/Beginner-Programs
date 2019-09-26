package advancedCalculator;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainComponents {
	private InnerComponents innerComponents;
	private JLabel display;
	private JPanel keyPad;
	
	private JPanel numPad;
	private JPanel operatorsPad;
	
	public MainComponents() {
		this.innerComponents = new InnerComponents();
		
		this.createDisplay();
		this.createKeyPad();
	}
	
	public void createDisplay() {
		this.display = innerComponents.display();
	}
	
	public void createNumPad() {
		JPanel keyPad = new JPanel();
		keyPad.setLayout(new GridLayout(4, 3));
		JButton[] numberButtons = innerComponents.numberButtons();
		int[] order = new int[] {7, 8, 9, 4, 5, 6, 1, 2, 3};
		
		for (int i = 0; i < 9; i++) {
			keyPad.add(numberButtons[order[i]]);
		}
		
		keyPad.add(innerComponents.operators().get("dot"));
		keyPad.add(numberButtons[0]);
		keyPad.add(innerComponents.operators().get("equal"));
		
		this.numPad = keyPad;
	}
	
	public void createOperatorsPad() {
		JPanel operatorsPad = new JPanel();
		operatorsPad.setLayout(new GridLayout(4, 1));
		
		operatorsPad.add(innerComponents.operators().get("add"));
		operatorsPad.add(innerComponents.operators().get("subtract"));
		operatorsPad.add(innerComponents.operators().get("multiply"));
		operatorsPad.add(innerComponents.operators().get("divide"));
		
		this.operatorsPad = operatorsPad;
	}
	
	private void createKeyPad() {
		this.createNumPad();
		this.createOperatorsPad();
		
		keyPad = new JPanel();		
		keyPad.setLayout(new GridBagLayout());
		GridBagConstraints c;
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.weighty = 1;
		c.ipadx = 240;
		c.fill = GridBagConstraints.VERTICAL;
		this.keyPad.add(this.numPad, c);
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 1;
		c.fill = GridBagConstraints.BOTH;
		this.keyPad.add(this.operatorsPad, c);
		
	}
	
	public JLabel getDisplay() {
		return display;
	}
	
	public JPanel getKeyPad() {
		return keyPad;
	}
	
}
