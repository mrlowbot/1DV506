package km222nb_lab2;

//Uppgift 6.
import java.util.Scanner;

public class NastStorsta {
	public static void main(String[] args) {

		int max = 0, second_max = 0, temp;
		Scanner scanner = new Scanner(System.in);
		int numbers1 = 10;

		System.out.println("Notera att heltal som �r efter dem 10 f�rsta heltal kommer ej att vara med f�r utr�kningen av det n�stst�rsta hel talet!");
		System.out.print("Skriv in 10 heltal med mellanslag mellan varje heltal : ");
		for (int i = 0; i < numbers1; i++) {
			if (i == 0) {
				max = scanner.nextInt();
			} else {
				temp = scanner.nextInt();
				if (temp > max) {
					second_max = max;
					max = temp;
				} else if (temp > second_max) {
					second_max = temp;
				}
			}
		}
		scanner.close();
		System.out.println("N�st st�rsta talet �r : " + second_max);
	}
}