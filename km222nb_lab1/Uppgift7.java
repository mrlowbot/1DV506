package km222nb_lab1;

import java.util.Scanner;

public class Uppgift7 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		// S�ger att pga input s� kan vi inte skriva in vadsomhelst utan
		// tvekan... anatar jag!

		// FR�GA P� LABEN!

		Scanner input = new Scanner(System.in);
		// Vi kan skriva in v�rden!
		System.out.println("Skriv in v�rdet f�r fahrenheit");
		// S�ger �t oss att vi kan skriva in v�rden!
		double fahrenheit = input.nextDouble();
		// Double deklaration f�r fahrenheit!

		double celsius = (5.0 / 9) * (fahrenheit - 32);
		// Double deklaration f�r celsuis!
		// Samt s� r�knar vi ut celsius genom fahrenheit
		// med ekvationen "(5.0/9) multiplicerat med fahrenheit minus 32"!

		System.out.println("Fahrenheit " + " �r " + celsius + " Celcius! ");
		// Skriver ut ett v�rde av celsius efter att vi har skrivit in ett v�rde av
		// fahrenheit!
	}

}
//Jag omvandlade 9/5 till 5/9 d� jag �r mer van vid att r�kna s�! 
//Sedan �ndrade jag hur vi r�knade ut celsuis genom att tabort 32 genom "fahrenheit"
//Och sedan multiplicera det med 5.0/9.
//NOTERA! Det g�r ej att ta 5/9 d� vi har sagt att celsuius, s� som fahrenheit 
//�r doubles och �rmed m�ste ha n�gon decimal efter sig! 