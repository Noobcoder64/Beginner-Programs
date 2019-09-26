package packages.wormgame;

public class Piece {
	int x;
	int y;
	
	public Piece(int x, int y) {
		this.x = (500 + x) % 500;
		this.y = (500 + y) % 500;
	}
	
	public boolean runsIntoPiece(Piece piece) {
		if (this.x == piece.x && this.y == piece.y) return true;
		return false;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
}
