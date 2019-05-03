package km222nb_lab1;

import java.util.Scanner; //Scanner lib, f�r att kunna skriva in v�rden. 

public class Uppgift9 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		// Final betyder att den som �r ekvivalent till
		// Sekunder samt Minuter �r fasta tal som inte �ndras!

		// Deklarationer!
		final int HSekunder = 60;
		final int HMinuter = 60;
		int Sekunder;
		int Minuter;
		int Timme;

		System.out.println("Skriv in sekunder!");
		// Prinat "skriv in sekunder..."
		Sekunder = console.nextInt();
		// Sekunderna kan scannas in!
		// Blir endast heltal.
		System.out.print("");

		Minuter = Sekunder / HSekunder;
		// F�rst s� tar vi minuterna = sekundern genom Hsekunderna.
		Sekunder -= Minuter * HMinuter;
		// Sedan s�ger vi att det negativa v�rdet av sekunderna blir samma som minuterna
		// g�nger Hminuterna.
		Timme = Minuter / HMinuter;
		// Timmen �r minuterna genom Hminuterna.
		Minuter -= Timme * HMinuter;
		// Det negativa slutv�rdet som ocks� �r timme multiplicerat med Hminuterna.

		System.out.println("Tiden �r " + Timme + ":" + Minuter + ":" + Sekunder + " fr�n sekunderna!");
		// Vi skriver ut timmen/timmarna med semikolon och sedan minuten/minuterna och
		// sedan semikolon och sist sekunden/sekunderna.

	}

}
