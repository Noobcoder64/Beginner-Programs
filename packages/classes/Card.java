package packages.classes;
public class Card implements Comparable<Card> {
	public static final int SPADES  = 0;
    public static final int DIAMONDS  = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS   = 3;
    
    int value;
    int suit;
    String suitString;
    
    public Card(int value, int suit) {
    	this.value = value;
    	this.suit = suit;
    	switch (suit) {
    		case 0:
    			suitString = "Spades";
    			break;
    		case 1:
    			suitString = "Diamonds";
    			break;
    		case 2:
    			suitString = "Hearts";
    			break;
    		case 3:
    			suitString = "Clubs";
    			break;
    	}
    }
    	
    public String toString() {
    	return value + " of " + this.suitString;
    }
    
    public int compareTo(Card card) {
    	int integer = this.value - card.value;
    	if (integer == 0) {
    		return this.suit - card.suit;
    	}
    	return integer;
    }
    
    public int getSuit() {
    	return this.suit;
    }
}
