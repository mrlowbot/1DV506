package km222nb_lab1;

import java.util.Random; //Lib f�r random. 

public class Uppgift14 {

	public static void main(String[] args) {

		// Deklaraion f�r varje nummer.
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;

		Random R = new Random();
		// Vi s�ger att R �r ekvivalent med ett slumpvist valt nummer.

		for (int time = 1; time <= 1; time++) {
			n1 = R.nextInt(100);
			System.out.println("V�ra v�rden blir: ");
			System.out.println(n1);
			// Jag valde att s�ga en hel forloop f�r varje slumpvist generarade v�rde.
			// F�rst s� s�ger vi att deklarationen f�r namn �r lika med 1 och sedan att om
			// time �r mindre eller lika med 1 s� ska vi addera tills den blir 1.
			// D�refter s� s�ger vi att f�rsta talet, n, ska vara ekvivalent med R fr�n 1
			// till 100.
			// Och att den enbart �r en integer och inte en double eller n�got annat.
			// Vi r�knar p� heltal!
			// D�refter s� skriver vi ut v�rdet som vi f�tt och g�r vidrare till n�sta
			// forloop.

			// Skilladen �r deklarationen n, n2, n3 osv... annars �r alla andra forloopar
			// samma.

		}

		for (int time = 1; time <= 1; time++) {
			n2 = R.nextInt(100);
			System.out.println(n2);

		}

		for (int time = 1; time <= 1; time++) {
			n3 = R.nextInt(100);
			System.out.println(n3);

		}

		for (int time = 1; time <= 1; time++) {
			n4 = R.nextInt(100);
			System.out.println(n4);

		}

		for (int time = 1; time <= 1; time++) {
			n5 = R.nextInt(100);
			System.out.println(n5);

		}

		// Nu s�egr vi att deklarationen hellfire �r ekvivalent till alla
		// v�ra v�rden sammanlagt.
		int hellfire = (n1 + n2 + n3 + n4 + n5);

		System.out.println("Samt den sammanlagda summan blir " + hellfire);
		// Sedan s� printar vi ut att "Samt den sammanlagda summan blir" och hellfire.
	}

}
