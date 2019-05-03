package km222nb_lab1;

import java.util.Scanner; //Scanner så vi kan skriva in värden. 

public class Uppgift10 {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Skriv in ett tresiffrigt heltal");
		int Ut = in.nextInt();
		// Deklaration för inskrivningen.
		int Summa = 0;

		// Medan vårat inskriva värde är större än noll
		// så säger vi att deklarationen av Addition är samma som
		// det inskriva värdet genom modulo 10.
		// Och sedan säger vi att summan är samma sak som summan + addition...
		// Som har gått igenom modulo.
		// Sedan tar vi Ut genom 10.
		while (Ut > 0) {
			int Addition = Ut % 10;
			Summa = Summa + Addition;
			Ut = Ut / 10;
		}
		System.out.println(Summa);
		// Vi skriver ut Summan som vi får i slutet!
	}

}
