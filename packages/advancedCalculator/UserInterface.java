package packages.advancedCalculator;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
	private JFrame frame;
	
	@Override
	public void run() {
		frame = new JFrame("Calculator");
		frame.setPreferredSize(new Dimension(400, 600));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container container) {
		container.setLayout(new GridBagLayout());
		GridBagConstraints c;
		
		MainComponents mainComponents = new MainComponents();
		
		JLabel display = mainComponents.getDisplay();
		
		JPanel keyPad = mainComponents.getKeyPad();
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 120;
		c.weightx = 1;
		container.add(display, c);
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		container.add(keyPad, c);
	}
}


