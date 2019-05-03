package km222nb_lab2;

//Uppgift 5. 
import java.util.Scanner;

public class Triangle {

	static public void main(String[] args) {

		System.out.print("Skriv in ett udda tal som ej är negativt : ");

		Scanner helhett = new Scanner(System.in);
		int helhet = helhett.nextInt();

		if ((helhet % 2 == 0) || (helhet < 0)) {
			System.out.println(
					"Du skrev ett jämnt tal eller ett negativt tal. Starta om och skriv in ett udda heltal som är positivt!");
			System.exit(helhet);
		}

		int j = 1, q = 1, b = 1;

		System.out.println("");
		System.out.println("Här är en rätvinklig triangel!");
		System.out.println("");
		for (int k = 1; k <= helhet; k++) {

			for (int i = 1; i <= helhet; i++) {

				if (k <= i) {

					System.out.print(" *");
				}
			}

			System.out.println();
			helhett.close();

		}

		System.out.println("");
		System.out.println("Här är en likbent triangel!");
		System.out.println("");

		for (j = 1; j <= helhet; j++) {

			for (q = j; q < helhet; q++)
				System.out.print(" ");
			for (b = 1; b < (j + 1); b++)
				System.out.print(" *");
			System.out.print("\n");

		}

	}

}
