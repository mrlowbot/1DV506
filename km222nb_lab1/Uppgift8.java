package km222nb_lab1;

import java.util.Scanner; //Lib f�r att kunna skriva in n�got!

public class Uppgift8 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);// Input = namnet f�r input f�r senare tillf�llen som �r lika med
												// "Scanner".

		System.out.println("�rs r�ntan ligger p� 9%"); // S�ger att r�ntan ligger p� 9 %....
		System.out.println("");
		System.out.println("");
		System.out.println("Skriv ett v�rde i kronor f�r att se hur mycket du f�r efter 5 �r");
		// S�ger, aka printar,
		// att vi ska skriva in
		// ett v�rde
		// s� att vi ska kunna
		// se
		// hur mycket det blir om
		// 5 �r genom 9 % r�nta!

		double Besparing = input.nextDouble();
		// Double f�r decimalerna! Deklarerar den!

		double Fem�r = (0.09 * 6) * Besparing + Besparing;
		// Double f�r �ren, som senare blir svaren.
		// Vi s�ger att fem�r = 9 % multiplicerat med 6 och sedan hela v�rdet plus det
		// nya
		// f�r att f� slut svaret med r�ntan.

		System.out.println("Efter 5 �r s� har du sparat " + Fem�r + " kronor!");
		// Printar ut slutsvaret fr�n fem�r.

	}
}
