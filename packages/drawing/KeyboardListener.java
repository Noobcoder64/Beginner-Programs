package packages.drawing;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {

    private Component component;
    private Avatar avatar;

    public KeyboardListener(Avatar avatar, Component component) {
        this.avatar = avatar;
        this.component = component;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            avatar.move(-5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            avatar.move(5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
        	avatar.move(0, -5);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			avatar.move(0, 5);
		}

        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}