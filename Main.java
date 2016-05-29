package cardgame;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Card> cards = new ArrayList();
		cards.add(new Card("H", 1));
		cards.add(new Card("S", 2));
		cards.add(new Card("C", 3));
		cards.add(new Card("D", 4));
		cards.add(new Card("A", 5));
		CardGame cardgame = new CardGame(cards);
		
		Card card = cardgame.battle();
		System.out.println("Winner card is" + card.name);
	}

}
