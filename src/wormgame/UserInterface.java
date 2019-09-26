package wormgame;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
	JFrame frame;
	DrawingBoard drawingBoard;
	
	WormGame wormGame;
	
	public UserInterface(WormGame wormGame) {
		this.wormGame = wormGame;
	}
	
	@Override
	public void run() {
		frame = new JFrame("Worm Game");
		frame.setPreferredSize(new Dimension(500, 500));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container container) {
		this.drawingBoard = new DrawingBoard(wormGame);
		wormGame.setUpdatable(drawingBoard);
		container.add(drawingBoard);
		
		KeyBoardListener keyBoardListener = new KeyBoardListener(wormGame);
		frame.addKeyListener(keyBoardListener);
	}
}