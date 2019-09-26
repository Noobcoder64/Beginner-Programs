package movingFigure;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
	private JFrame frame;
	private Figure figure;
	
	public UserInterface(Figure figure) {
		this.figure = figure;
	}
	
	@Override
	public void run() {
		frame = new JFrame("Moving Figure");
		frame.setPreferredSize(new Dimension(400, 400));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container container) {
		DrawingBoard drawingBoard = new DrawingBoard(figure);
		container.add(drawingBoard);
		
		frame.addKeyListener(new KeyboardListener(drawingBoard, figure));
	}
	
}
