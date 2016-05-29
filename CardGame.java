package cardgame;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
	private List<Card> cards = new ArrayList<Card>();
	CardGame (List<Card> cards) {
		this.cards = cards;
	}
	
	public Card battle () {
		int i;
		int k;
		
		while(true){
			 i = new java.util.Random().nextInt(cards.size());
			 k = new java.util.Random().nextInt(cards.size());
			
			if(i == k) {
				continue;
			}
			break;
		}
		
		Card cardA = cards.get(i);
		Card cardB = cards.get(k);
		
		if (cardA.win(cardB)) {
			return cardB;
		} else {
			return cardA;
		}
	}
}
