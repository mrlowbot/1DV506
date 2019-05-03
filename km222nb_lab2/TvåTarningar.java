package km222nb_lab2;

//Uppgift 12.
import java.util.Random;

public class TvåTarningar {

	public static void main(String[] args) {

		Random R = new Random();

		int side1;
		int side2;
		int flee = 2;

		System.out.println("Frequency table (sum,count) for rolling two dices 10000 times");
		System.out.println("");

		int whole[] = new int[13];

		for (int k = 0; k < whole.length; k++) {
			whole[k] = 0;
		}

		for (int i = 1; i <= 10000; i++) {

			side1 = 1 + R.nextInt(6);
			side2 = 1 + R.nextInt(6);
			whole[side1 + side2]++;
		}

		for (int i = 2; i <= 12; i++) {

			System.out.println(flee++ + "      " + whole[i]);

			/*
			 * 
			 * Går också att byta bort den enda System.out.print för dessa print lines. Men
			 * då måste "i <= 2" i for loopen istället för 12. Ifall man vill att 10, 11 och
			 * 12 ska vara exakt efter varandra genom linjerna!
			 * 
			 * System.out.println((flee = 2) + "         " + whole[2]);
			 * System.out.println((flee = 3) + "         " + whole[3]);
			 * System.out.println((flee = 4) + "         " + whole[4]);
			 * System.out.println((flee = 5) + "         " + whole[5]);
			 * System.out.println((flee = 6) + "         " + whole[6]);
			 * System.out.println((flee = 7) + "         " + whole[7]);
			 * System.out.println((flee = 8) + "         " + whole[8]);
			 * System.out.println((flee = 9) + "         " + whole[9]);
			 * System.out.println((flee = 10) + "        " + whole[10]);
			 * System.out.println((flee = 11) + "        " + whole[11]);
			 * System.out.println((flee = 12) + "        " + whole[12]);
			 */
		}

	}

}
