package km222nb_lab2;

//Uppgift 1. 
import java.util.Scanner;

public class RaknaA {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Skriv någon mening här: ");

		String text = in.nextLine();

		int countA = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'A') {
				countA++;
			}
		}

		int counta = 0;
		for (int I = 0; I < text.length(); I++) {
			if (text.charAt(I) == 'a') {
				counta++;
			}
		}

		System.out.println("Antal stora och små A i din mening är: ");
		System.out.println("");
		System.out.println("Stora A: " + countA);
		System.out.println("Lilla a: " + counta);

		in.close();
	}

}
