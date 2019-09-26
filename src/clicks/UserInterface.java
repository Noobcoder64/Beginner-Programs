package clicks;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

	private JFrame frame;
	private Calculator calculator;
	
	public UserInterface(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		frame = new JFrame("Clicker");
		frame.setPreferredSize(new Dimension(200, 200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);	
	}

	private void createComponents(Container container) {
		container.setLayout(new GridLayout(2, 1));
		
		JLabel label = new JLabel("Press click to start...");
		JButton button = new JButton("Click!");
		
		button.addActionListener(new Clicker(calculator, label));
		
		container.add(label);
		container.add(button);
		
	}
	
}
