package packages.wormgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;

@SuppressWarnings("serial")
public class WormGame extends Timer implements ActionListener {
	Worm worm;
	Apple apple;
	Updatable updatable;
	boolean gameOver;
	
	public WormGame() {
		super(100, null);
		addActionListener(this);
		worm = new Worm(250, 250);
		this.apple = new Apple(0, 0);
		newApple();
		
		gameOver = false;
	}
	
	public Worm getWorm() {
		return worm;
	}
	
	public Apple getApple() {
		return apple;
	}
	
	public void newApple() {
		Random random = new Random();
		this.apple.setX(random.nextInt(46) * 10);
		this.apple.setY(random.nextInt(46) * 10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		worm.move();
		if (worm.getHead().runsIntoPiece(apple)) {
			worm.grow();
			newApple();
		}
		if (worm.runsIntoItself()) gameOver = true;
		
		if (!gameOver) updatable.update();
	}
	
	public void setUpdatable(Updatable updatable) {
		this.updatable = updatable;
	}
}
