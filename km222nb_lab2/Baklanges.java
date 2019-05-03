package km222nb_lab2;

//Uppgift 2.
import java.util.Scanner;

public class Baklanges {
	


	public static void main(String[] args) {

		Scanner inn = new Scanner(System.in);

		System.out.println("Skriv in något som du vill ha baklänges!");

		String s = inn.nextLine();
		int length = s.length();
		String Rev = "";

		for (int i = length - 1; i >= 0; i--) {
			Rev = Rev + s.charAt(i); 
		}

		System.out.println(": " + Rev);

		inn.close();

	}

}
