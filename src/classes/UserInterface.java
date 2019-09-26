package classes;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

    private JFrame frame; // object component container

    public UserInterface() {
    }

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(150, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane()); // JFrame's Container object as parameter

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        
        ButtonGroup checkBoxes = new ButtonGroup();
        checkBoxes.add(yes);
        checkBoxes.add(no);
        
        container.add(yes);
        container.add(no);
        
        container.add(new JLabel("Why?"));
        
        JRadioButton no_reason = new JRadioButton("No reason.");
        JRadioButton because_it_is_fun = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(no_reason);
        buttonGroup.add(because_it_is_fun);
        
        container.add(no_reason);
        container.add(because_it_is_fun);
        
        container.add(new JButton("Done!"));
    }

    public JFrame getFrame() {
        return frame;
    }
}
