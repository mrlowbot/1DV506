package km222nb_lab1;

import java.util.Scanner; //Lib för att kunna skriva in något!

public class Uppgift8 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);// Input = namnet för input för senare tillfällen som är lika med
												// "Scanner".

		System.out.println("Års räntan ligger på 9%"); // Säger att räntan ligger på 9 %....
		System.out.println("");
		System.out.println("");
		System.out.println("Skriv ett värde i kronor för att se hur mycket du får efter 5 år");
		// Säger, aka printar,
		// att vi ska skriva in
		// ett värde
		// så att vi ska kunna
		// se
		// hur mycket det blir om
		// 5 år genom 9 % ränta!

		double Besparing = input.nextDouble();
		// Double för decimalerna! Deklarerar den!

		double Femår = (0.09 * 6) * Besparing + Besparing;
		// Double för åren, som senare blir svaren.
		// Vi säger att femår = 9 % multiplicerat med 6 och sedan hela värdet plus det
		// nya
		// för att få slut svaret med räntan.

		System.out.println("Efter 5 år så har du sparat " + Femår + " kronor!");
		// Printar ut slutsvaret från femår.

	}
}
