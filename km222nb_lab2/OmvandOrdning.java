package km222nb_lab2;

//Uppgift 11.
import java.util.Scanner;

public class OmvandOrdning {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num[] = new int[100000];
		int hell = 0;

		System.out.println(
				"Skriv in ett par helvärden med enter mellan varje, stäng sedan med att skriva ett negativt värde: ");

		for (int i = 0; i < 100000; i++) {
			num[i] = in.nextInt();
			System.out.println("Värde " + (i + 1) + ": " + num[i]);
			hell++;

			if (num[i] < 0) {
				break;
			}

		}

		String Five = "Dina värden är: ";
		for (int i = hell; i >= 0; i--) {
			Five += num[i];
			if (i < hell) {
				Five += ", ";
			}
		}
		System.out.println(Five);
		System.out.println("Positiva värden : " + (hell - 1));
		in.close();

	}

}
