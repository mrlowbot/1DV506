package km222nb_lab2;

//Uppgift 3. 
public class Delbarhet {

	public static void main(String[] args) {

		System.out.println(
				"H�r �r alla v�rden mellan 100 och 200 som �r delbara med 4 eller 5 men inte b�da. 100 samt 200 �r ej inkulderade som svar.");
		for (int i = 100; i <= 200; i++) {
			if ((i % 5 == 0) && (i % 4 == 0)) {
				System.out.print("");
			} else if ((i % 4 == 0) ^ (i % 5 == 0)) {
				System.out.println(i);

				// System.out.println("i = " + i + " mod 4 = " + (i % 4));
				// } else if (i % 5 == 0) {
				// System.out.println("i = " + i + " mod 5 = " + (i % 5));
			}

		}

	}

}
