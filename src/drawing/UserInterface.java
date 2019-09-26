package drawing;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
	JFrame frame;
	private Avatar avatar;

    public UserInterface(Avatar avatar) {
        this.avatar = avatar;
    }
	
	@Override
	public void run() {
		frame = new JFrame("Drawing board");
		frame.setPreferredSize(new Dimension(300, 300));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container container) {
		DrawingBoard drawingBoard = new DrawingBoard(avatar);
        container.add(drawingBoard);

        frame.addKeyListener(new KeyboardListener(avatar, drawingBoard));
	}
	
}
