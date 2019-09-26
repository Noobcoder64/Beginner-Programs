package drawing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    private Avatar avatar;

    public DrawingBoard(Avatar avatar) {
        super.setBackground(Color.WHITE);
        this.avatar = avatar;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        avatar.draw(graphics);
    }
}
