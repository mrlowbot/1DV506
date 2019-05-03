package km222nb_lab1;

import java.util.Scanner; //Vi lägger in scanner lib. 
import java.text.DecimalFormat; //För att kunna formatera till dem decimaler vi vill ha sen
								//så lägger vi till en DecimalFormat lib. 

public class Uppgift15 {

	private static Scanner in = new Scanner(System.in); // Vi säger att in = scanner!

	public static void main(String[] args) {

		double x1 = 0; // För varje x/y värde så har vi double.
		double x2 = 0; // Går med vilkensom i detta läge men double har vi för decimalerna.
		double y1 = 0; // Float är inget som
		double y2 = 0;
		double längd = 0; // Resultatet.

		DecimalFormat decFor = new DecimalFormat("0.00"); // Vi säger att DecimalFormat går genom decFor och som sedan
															// säger att
															// vårat nya DecimalFormat har vilket värde som helst genom
															// första nollan.
															// Och som sedan endast går mot två decimaler efteråt. Inga
															// fler printas ut!

		System.out.println("Skriv in x1 kordinaten "); // Den säger att vi ska skriva in vårat första värde!
		x1 = in.nextInt(); // Läser av x1.
		System.out.println("Skriv in y1 kordinaten "); // Den säger att vi ska skriva in vårat andra värde!
		y1 = in.nextInt();// Läser av y1.
		System.out.println("Skriv in x2 kordinaten "); // Den säger att vi ska skriva in vårat tredje värde!
		x2 = in.nextInt();// Läser av x2.
		System.out.println("Skriv in y2 kordinaten "); // Den säger att vi ska skriva in vårat fjärde värde!
		y2 = in.nextInt();// Läser av y2.

		längd = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
		// Nu säger vi att våran längd är samma som den matematiska upphöjningen av x2 -
		// x1, upphöjt till 2, och som sedan
		// adderas med "math.pow" igen för y2 - y1 upphöjt i 2.

		System.out.println("Längden mellan punkterna är: " + decFor.format(längd) + " l.e");
		// Nu säger vi att vi ska skriva ut något! För det vi vill säga men sen också
		// det ordet som vi "gick igenom" tidigare.
		// decFor som var lika med Decimalformatet 0.00. Dvs om vi tar
		// decFor.format(sendan resultat genom formatet) så
		// får vi ut svaret i det format som vill ville komma till!

	}

}