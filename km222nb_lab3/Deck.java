package km222nb_lab3;

//Uppgift 8
//Länkad till Card klassen

public class Deck {

	public int stack(int[] ourDeck) {
		int i = 0;
		for (i = 0; i < ourDeck.length; i++) {
			ourDeck[i] = i;
		}
		return i ;

	}

	public int flush(int[] ourDeck) {
		int index = 0;

		for (int i = 0; i < ourDeck.length; i++) {
			ourDeck[i] = i;

			for (int k = 0; k < ourDeck.length; k++) {
				index = (int) (Math.random() * ourDeck.length);
				int temp = ourDeck[k];
				ourDeck[k] = ourDeck[index];
				ourDeck[index] = temp;
			}
		}
		return ourDeck[index];
	}

	public int create(int Mnumber, int[] k, String[] suits, String[] rank) {

		int counter = 0;
		for (int i = 0; i < Mnumber; i++) {
			String Suit = suits[k[i] / 13];
			String Rank = rank[k[i] % 13];
			counter++;
			System.out.println("Card number is " + k[i] + " : " + Rank + " of " + Suit);
			if (counter == Mnumber) {
				System.out.print("And there are " + (52 - Mnumber) + " cards left!");
			}
		}
		return counter;

	}
}
