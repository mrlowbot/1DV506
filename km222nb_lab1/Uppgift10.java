package km222nb_lab1;

import java.util.Scanner; //Scanner s� vi kan skriva in v�rden. 

public class Uppgift10 {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Skriv in ett tresiffrigt heltal");
		int Ut = in.nextInt();
		// Deklaration f�r inskrivningen.
		int Summa = 0;

		// Medan v�rat inskriva v�rde �r st�rre �n noll
		// s� s�ger vi att deklarationen av Addition �r samma som
		// det inskriva v�rdet genom modulo 10.
		// Och sedan s�ger vi att summan �r samma sak som summan + addition...
		// Som har g�tt igenom modulo.
		// Sedan tar vi Ut genom 10.
		while (Ut > 0) {
			int Addition = Ut % 10;
			Summa = Summa + Addition;
			Ut = Ut / 10;
		}
		System.out.println(Summa);
		// Vi skriver ut Summan som vi f�r i slutet!
	}

}
