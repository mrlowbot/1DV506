package km222nb_lab1;

import java.util.Scanner; //Scanner lib, för att kunna skriva in värden. 

public class Uppgift9 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		// Final betyder att den som är ekvivalent till
		// Sekunder samt Minuter är fasta tal som inte ändras!

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
		// Först så tar vi minuterna = sekundern genom Hsekunderna.
		Sekunder -= Minuter * HMinuter;
		// Sedan säger vi att det negativa värdet av sekunderna blir samma som minuterna
		// gånger Hminuterna.
		Timme = Minuter / HMinuter;
		// Timmen är minuterna genom Hminuterna.
		Minuter -= Timme * HMinuter;
		// Det negativa slutvärdet som också är timme multiplicerat med Hminuterna.

		System.out.println("Tiden är " + Timme + ":" + Minuter + ":" + Sekunder + " från sekunderna!");
		// Vi skriver ut timmen/timmarna med semikolon och sedan minuten/minuterna och
		// sedan semikolon och sist sekunden/sekunderna.

	}

}
