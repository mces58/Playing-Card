import com.playingCards.Deck;

public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		
		deck.print(); // prints in order
		
		deck.mixer(500); // mixes 500 times
		
		deck.print(); 
		
		System.out.println();
		System.out.println(deck.showCard()); // gives the top card
		System.out.println(deck.showCard());
		System.out.println(deck.showCard());
		
	}

}
