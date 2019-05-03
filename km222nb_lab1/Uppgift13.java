package km222nb_lab1;

import java.util.Scanner; 

public class Uppgift13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Skriv in ditt förnamn!");
		String namnEtt = in.nextLine();

		System.out.println("Skriv in ditt efternamn!");
		String namnTvå = in.nextLine() + "       ";
		
		
		String initialer = namnEtt.substring(0, 1) + ". " + namnTvå.substring(0, 4);
		System.out.println("Din initial samt fyra första bokstäver i ditt" + "efter namn är: " + initialer);

		in.close();
	}
}
