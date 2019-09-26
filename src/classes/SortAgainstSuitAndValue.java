package classes;
import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

	@Override
	public int compare(Card card1, Card card2) {
		int integer = card1.suit - card2.suit;
		if (integer == 0) {
			integer = card1.value - card2.value;
		}
		return integer;
	}

	
}
