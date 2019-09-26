package packages.wormgame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardListener implements KeyListener {
	WormGame wormGame;
	
	public KeyBoardListener(WormGame wormGame) {
		this.wormGame = wormGame;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			wormGame.getWorm().setDirection(Direction.UP);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			wormGame.getWorm().setDirection(Direction.DOWN);
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			wormGame.getWorm().setDirection(Direction.LEFT);
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			wormGame.getWorm().setDirection(Direction.RIGHT);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
