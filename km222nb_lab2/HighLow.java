package km222nb_lab2;

//Uppgift 4. 
import java.util.Scanner;
import java.util.Random;

public class HighLow {

	public static final Random value = new Random();
	public static final int maxValue = 100;

	public static void main(String[] args) {

		int VALUE = value.nextInt(maxValue) + 1;
		Scanner inn = new Scanner(System.in);

		int Tries = 0;
		int userAmoutOfGuesses = 0;

		System.out.println("Skriv in ett tall mellan 1 och 100");

		while (userAmoutOfGuesses != VALUE) {
			userAmoutOfGuesses = inn.nextInt();
			Tries++;

			if (userAmoutOfGuesses < 1 || userAmoutOfGuesses > maxValue) {
				System.out.println("Skriv enbart tal mellan 1 och 100!");
			}

			if (userAmoutOfGuesses > VALUE) {
				System.out.println("F�r h�gt v�rde!");
			}

			else if (userAmoutOfGuesses < VALUE) {

				System.out.println("F�r l�gt v�rde!");
			}

			if (Tries > 10) {
				System.out.print("Slut p� gissningar, svaret var: " + VALUE + " f�rs�k igen! :) ");
				System.exit(userAmoutOfGuesses);

			}

		}

		System.out.print("Grattis du fick: " + VALUE + " p� " + Tries + " antal gissningar!");
		inn.close();

	}
}
