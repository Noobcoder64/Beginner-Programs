package packages.wormgame;

import java.util.ArrayList;
import java.util.List;

public class Worm {
	List<Piece> pieces;
	Direction direction;

	public Worm(int originalX, int originalY) {
		pieces = new ArrayList<Piece>();
		pieces.add(new Piece(originalX, originalY));
		direction = Direction.RIGHT;
	}

	public void move() {
		grow();
		if (pieces.size() > 3) pieces.remove(0);
	}

	public void grow() {
		switch (direction) {
		case UP:
			pieces.add(new Piece(getHead().getX(), getHead().getY() - 10));
			break;
		case DOWN:
			pieces.add(new Piece(getHead().getX(), getHead().getY() + 10));
			break;
		case LEFT:
			pieces.add(new Piece(getHead().getX() - 10, getHead().getY()));
			break;
		case RIGHT:
			pieces.add(new Piece(getHead().getX() + 10, getHead().getY()));
			break;
		}	
	}
	
	public boolean runsIntoItself() {
		for (Piece piece : pieces) {
			if (piece != getHead())
			if (piece.runsIntoPiece(getHead())) return true;
		}
		return false;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public List<Piece> getPieces() {
		return pieces;
	}
	
	public Piece getHead() {
		return pieces.get(pieces.size() - 1);
	}
	
}
