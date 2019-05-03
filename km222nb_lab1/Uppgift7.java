package km222nb_lab1;

import java.util.Scanner;

public class Uppgift7 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		// Säger att pga input så kan vi inte skriva in vadsomhelst utan
		// tvekan... anatar jag!

		// FRÅGA PÅ LABEN!

		Scanner input = new Scanner(System.in);
		// Vi kan skriva in värden!
		System.out.println("Skriv in värdet för fahrenheit");
		// Säger åt oss att vi kan skriva in värden!
		double fahrenheit = input.nextDouble();
		// Double deklaration för fahrenheit!

		double celsius = (5.0 / 9) * (fahrenheit - 32);
		// Double deklaration för celsuis!
		// Samt så räknar vi ut celsius genom fahrenheit
		// med ekvationen "(5.0/9) multiplicerat med fahrenheit minus 32"!

		System.out.println("Fahrenheit " + " är " + celsius + " Celcius! ");
		// Skriver ut ett värde av celsius efter att vi har skrivit in ett värde av
		// fahrenheit!
	}

}
//Jag omvandlade 9/5 till 5/9 då jag är mer van vid att räkna så! 
//Sedan ändrade jag hur vi räknade ut celsuis genom att tabort 32 genom "fahrenheit"
//Och sedan multiplicera det med 5.0/9.
//NOTERA! Det går ej att ta 5/9 då vi har sagt att celsuius, så som fahrenheit 
//är doubles och ärmed måste ha någon decimal efter sig! 