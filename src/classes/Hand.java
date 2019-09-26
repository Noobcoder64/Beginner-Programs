package classes;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
	ArrayList<Card> cards;
	int totalValue = 0;
	
	public Hand() {
		this.cards = new ArrayList<Card>();
	}
	
	public void add(Card card) {
		this.cards.add(card);
		totalValue += card.value;
	}
	
	public void print() {
		for (Card card : cards) {
			System.out.println(card);
		}
	}
	
	public void sort() {
		Collections.sort(cards);
	}
	
	public void sortAgainstSuit() {
		Collections.sort(cards, new SortAgainstSuitAndValue());
	}
	
	public int compareTo(Hand hand) {
		return this.totalValue - hand.totalValue;
	}
	
}
