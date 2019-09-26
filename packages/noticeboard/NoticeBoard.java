package packages.noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class NoticeBoard implements ActionListener {
	JTextField textfield;
	JLabel label;
	
	public NoticeBoard(JTextField textField, JLabel label) {
		this.textfield = textField;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.label.setText(this.textfield.getText());
	}

}
