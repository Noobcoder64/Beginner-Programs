package packages.calculator;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
	private JFrame frame;
	private Calculator calculator;
	
	public UserInterface(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		frame = new JFrame("Calculator");
		frame.setPreferredSize(new Dimension(200, 200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container container) {
		container.setLayout(new GridLayout(3, 1));
		JTextField output = new JTextField("0");
		output.setEnabled(false);
		JTextField input = new JTextField();
		
		container.add(output);
		container.add(input);
		
		JPanel panel = new JPanel(new GridLayout(1, 3));
		
		JButton add = new JButton("+");		
		JButton sub = new JButton("-");
		JButton clear = new JButton("Z");
		clear.setEnabled(false);
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				
				try {
					if (e.getSource() == add) {
						result = calculator.add(Integer.parseInt(input.getText()), Integer.parseInt(output.getText()));
					} else if (e.getSource() == sub) {
						result = calculator.sub(Integer.parseInt(input.getText()), Integer.parseInt(output.getText()));
					} 
				} catch (Exception ex) {
					result = Integer.parseInt(output.getText());
				}
				
				input.setText(null);
				output.setText(result + "");
				
				if (output.getText().equals("0")) {
					clear.setEnabled(false);
				} else {
					clear.setEnabled(true);
				}
			}
		};

		add.addActionListener(listener);
		sub.addActionListener(listener);
		clear.addActionListener(listener);
		
		panel.add(add);
		panel.add(sub);
		panel.add(clear);
		
		container.add(panel);
		
	}

}
