package packages.wormgame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import packages.classes.MyDate;

public class DrawingBoard extends JPanel implements Updatable {
	private WormGame wormGame;
	private Worm worm;
	private Apple apple;
	
	public DrawingBoard(WormGame wormGame) {
		this.wormGame = wormGame;
		this.worm = wormGame.getWorm();
		this.apple = wormGame.getApple();
		
		super.setBackground(Color.black);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.red);
		g.fillOval(apple.getX(), apple.getY(), 10, 10);
		
		g.setColor(Color.white);
		for (Piece piece : worm.getPieces()) {
			g.fill3DRect(piece.getX(), piece.getY(), 10, 10, true);	
		}
	}

	public void update() {
		super.repaint();
	}
	
}
