package km222nb_lab1;

import java.util.Scanner; //Vi l�gger in scanner lib. 
import java.text.DecimalFormat; //F�r att kunna formatera till dem decimaler vi vill ha sen
								//s� l�gger vi till en DecimalFormat lib. 

public class Uppgift15 {

	private static Scanner in = new Scanner(System.in); // Vi s�ger att in = scanner!

	public static void main(String[] args) {

		double x1 = 0; // F�r varje x/y v�rde s� har vi double.
		double x2 = 0; // G�r med vilkensom i detta l�ge men double har vi f�r decimalerna.
		double y1 = 0; // Float �r inget som
		double y2 = 0;
		double l�ngd = 0; // Resultatet.

		DecimalFormat decFor = new DecimalFormat("0.00"); // Vi s�ger att DecimalFormat g�r genom decFor och som sedan
															// s�ger att
															// v�rat nya DecimalFormat har vilket v�rde som helst genom
															// f�rsta nollan.
															// Och som sedan endast g�r mot tv� decimaler efter�t. Inga
															// fler printas ut!

		System.out.println("Skriv in x1 kordinaten "); // Den s�ger att vi ska skriva in v�rat f�rsta v�rde!
		x1 = in.nextInt(); // L�ser av x1.
		System.out.println("Skriv in y1 kordinaten "); // Den s�ger att vi ska skriva in v�rat andra v�rde!
		y1 = in.nextInt();// L�ser av y1.
		System.out.println("Skriv in x2 kordinaten "); // Den s�ger att vi ska skriva in v�rat tredje v�rde!
		x2 = in.nextInt();// L�ser av x2.
		System.out.println("Skriv in y2 kordinaten "); // Den s�ger att vi ska skriva in v�rat fj�rde v�rde!
		y2 = in.nextInt();// L�ser av y2.

		l�ngd = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
		// Nu s�ger vi att v�ran l�ngd �r samma som den matematiska upph�jningen av x2 -
		// x1, upph�jt till 2, och som sedan
		// adderas med "math.pow" igen f�r y2 - y1 upph�jt i 2.

		System.out.println("L�ngden mellan punkterna �r: " + decFor.format(l�ngd) + " l.e");
		// Nu s�ger vi att vi ska skriva ut n�got! F�r det vi vill s�ga men sen ocks�
		// det ordet som vi "gick igenom" tidigare.
		// decFor som var lika med Decimalformatet 0.00. Dvs om vi tar
		// decFor.format(sendan resultat genom formatet) s�
		// f�r vi ut svaret i det format som vill ville komma till!

	}

}