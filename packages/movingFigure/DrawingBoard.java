package packages.movingFigure;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
	private Figure figure;
	
	public DrawingBoard(Figure figure) {
		this.figure = figure;
	}
	
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		figure.draw(graphics);
	}
	
}
