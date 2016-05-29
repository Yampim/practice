package cardgame;

public class Card {
	String name;
	int value;
	public Card ( String name, int value ) {
		this.name = name;
		this.value = value;
	}

	public boolean win ( Card card ) {
		if(card.value > value) {
			return true;
		} 
		return false;
	}
	
}
