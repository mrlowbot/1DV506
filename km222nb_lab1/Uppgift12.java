package km222nb_lab1;

import java.text.DecimalFormat; //Format för att kunna vilja hur många decimaler för något senare.
import java.util.Scanner; //För att kunna skriva in värden! 

public class Uppgift12 {

	private static Scanner in = new Scanner(System.in);
	// Vii säger att in = att vi kan skriva in något.

	public static void main(String[] args) {

		DecimalFormat decFor = new DecimalFormat("0.0");
		// Vi säger att decFor är DecimalFormatet och som sedan kan vara vilket tal som
		// helst
		// och som sedan endast ger ut en decimal efteråt.

		System.out.println("Ange radien från en cirkel som du vill räkna ut!");

		Double Radie;
		// Double är float funkar.
		// Float hade dock varit ett lite mer bättre värde ifall man vill vara praktisk.
		// Endast för att double är större än float. Och tar plats.. men kanske inte så
		// mycket.

		Radie = in.nextDouble();
		// Radien är det värde som vi skriver in och radien är en double.

		// Ekvationen för Arean på en cirkel är radien upphöjt med två och multiplicerat
		// med pi.
		Radie = (Radie * Radie * 3.14);
		// Vi säger att radien är ekvivalent med Radien gånger Radien och sedan 3.14 aka
		// pi.

		System.out.println("Din cirkels area blir " + decFor.format(Radie));
		// Vi skriver ut "Din cirkels area blir" och sedan decFor som är namnet vi gav
		// för att sedan säga
		// att decFor.format(med något värde här inne) som enbart går igenom det vi sa
		// innan...
		// Dvs (0.0). Den första nollan kan vara väldigt stor men den andra visar endast
		// en siffra.. en decimal.

	}
}