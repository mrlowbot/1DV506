package km222nb_lab3;

//Uppgift 8
//Denna klass körs ensam. 
//Är ej länkad till Card eller Deck klassen! 

public class DeckMain {
	static int[] ourDeck = new int[52];

	public static void main(String[] args) {
		int Mnumber = 3; // Value for the amout of cards that are given out!
		int counter = 0;
		// Deck objectDeck = new Deck();

		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		for (int i = 0; i < ourDeck.length; i++) {
			ourDeck[i] = i;

		}

		for (int i = 0; i < ourDeck.length; i++) {
			int index = (int) (Math.random() * ourDeck.length);
			int temp = ourDeck[i];
			ourDeck[i] = ourDeck[index];
			ourDeck[index] = temp;

		}

		for (int i = 0; i < Mnumber; i++) {
			String Suit = suits[ourDeck[i] / 13];
			String Rank = rank[ourDeck[i] % 13];
			counter++;
			System.out.println("Card number is " + ourDeck[i] + " : " + Rank + " of " + Suit);
			if (counter == Mnumber) {
				System.out.print("And there are " + (52 - Mnumber) + " cards left!");
			}
		}
	}

}
