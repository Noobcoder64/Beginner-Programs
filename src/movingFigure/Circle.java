package movingFigure;

import java.awt.Graphics;

public class Circle extends Figure	{
	private int diamater;
	
	public Circle(int x, int y, int diamater) {
		super(x, y);
		this.diamater = diamater;
	}

	@Override
	public void draw(Graphics graphics) {
		graphics.fillOval(x, y, diamater, diamater);
	}
	
}
