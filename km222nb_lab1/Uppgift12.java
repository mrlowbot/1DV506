package km222nb_lab1;

import java.text.DecimalFormat; //Format f�r att kunna vilja hur m�nga decimaler f�r n�got senare.
import java.util.Scanner; //F�r att kunna skriva in v�rden! 

public class Uppgift12 {

	private static Scanner in = new Scanner(System.in);
	// Vii s�ger att in = att vi kan skriva in n�got.

	public static void main(String[] args) {

		DecimalFormat decFor = new DecimalFormat("0.0");
		// Vi s�ger att decFor �r DecimalFormatet och som sedan kan vara vilket tal som
		// helst
		// och som sedan endast ger ut en decimal efter�t.

		System.out.println("Ange radien fr�n en cirkel som du vill r�kna ut!");

		Double Radie;
		// Double �r float funkar.
		// Float hade dock varit ett lite mer b�ttre v�rde ifall man vill vara praktisk.
		// Endast f�r att double �r st�rre �n float. Och tar plats.. men kanske inte s�
		// mycket.

		Radie = in.nextDouble();
		// Radien �r det v�rde som vi skriver in och radien �r en double.

		// Ekvationen f�r Arean p� en cirkel �r radien upph�jt med tv� och multiplicerat
		// med pi.
		Radie = (Radie * Radie * 3.14);
		// Vi s�ger att radien �r ekvivalent med Radien g�nger Radien och sedan 3.14 aka
		// pi.

		System.out.println("Din cirkels area blir " + decFor.format(Radie));
		// Vi skriver ut "Din cirkels area blir" och sedan decFor som �r namnet vi gav
		// f�r att sedan s�ga
		// att decFor.format(med n�got v�rde h�r inne) som enbart g�r igenom det vi sa
		// innan...
		// Dvs (0.0). Den f�rsta nollan kan vara v�ldigt stor men den andra visar endast
		// en siffra.. en decimal.

	}
}