package km222nb_lab1;

import java.util.Scanner; 

public class Uppgift13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Skriv in ditt f�rnamn!");
		String namnEtt = in.nextLine();

		System.out.println("Skriv in ditt efternamn!");
		String namnTv� = in.nextLine() + "       ";
		
		
		String initialer = namnEtt.substring(0, 1) + ". " + namnTv�.substring(0, 4);
		System.out.println("Din initial samt fyra f�rsta bokst�ver i ditt" + "efter namn �r: " + initialer);

		in.close();
	}
}
