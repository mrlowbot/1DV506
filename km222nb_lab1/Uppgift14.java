package km222nb_lab1;

import java.util.Random; //Lib för random. 

public class Uppgift14 {

	public static void main(String[] args) {

		// Deklaraion för varje nummer.
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;

		Random R = new Random();
		// Vi säger att R är ekvivalent med ett slumpvist valt nummer.

		for (int time = 1; time <= 1; time++) {
			n1 = R.nextInt(100);
			System.out.println("Våra värden blir: ");
			System.out.println(n1);
			// Jag valde att säga en hel forloop för varje slumpvist generarade värde.
			// Först så säger vi att deklarationen för namn är lika med 1 och sedan att om
			// time är mindre eller lika med 1 så ska vi addera tills den blir 1.
			// Därefter så säger vi att första talet, n, ska vara ekvivalent med R från 1
			// till 100.
			// Och att den enbart är en integer och inte en double eller något annat.
			// Vi räknar på heltal!
			// Därefter så skriver vi ut värdet som vi fått och går vidrare till nästa
			// forloop.

			// Skilladen är deklarationen n, n2, n3 osv... annars är alla andra forloopar
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

		// Nu säegr vi att deklarationen hellfire är ekvivalent till alla
		// våra värden sammanlagt.
		int hellfire = (n1 + n2 + n3 + n4 + n5);

		System.out.println("Samt den sammanlagda summan blir " + hellfire);
		// Sedan så printar vi ut att "Samt den sammanlagda summan blir" och hellfire.
	}

}
