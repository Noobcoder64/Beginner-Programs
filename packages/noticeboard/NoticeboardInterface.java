package packages.noticeboard;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class NoticeboardInterface implements Runnable {

    private JFrame frame; // object component container

    public NoticeboardInterface() {
		
	}

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane()); // JFrame's Container object as parameter

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
    	 container.setLayout(new GridLayout(3, 1));
    	 
    	 JTextField textField = new JTextField();
    	 JButton button = new JButton("Copy!");
       	 JLabel label = new JLabel();
    	 
    	 button.addActionListener(new NoticeBoard(textField, label));
 
    	 container.add(textField);
    	 container.add(button);
    	 container.add(label);
    }

    public JFrame getFrame() {
        return frame;
    }
}
