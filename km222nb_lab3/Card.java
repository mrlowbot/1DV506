package km222nb_lab3;

//Uppgift 8
//Länkad till Deck klassen

import java.util.*;

public class Card {

	static String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	static String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	public static final int[] ourDeck = new int[52];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Deck objectDeck = new Deck();
		objectDeck.stack(ourDeck);
		objectDeck.flush(ourDeck);
		System.out.print("Please write in the number of cards that you would like to get : ");
		int alpha = in.nextInt();
		objectDeck.create(alpha, ourDeck, suits, rank);
		in.close();

	}
}
