package km222nb_lab2;

//Uppgift 10.
public class BytaPlats {
	public static void main(String[] args) {
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't', 't', 'e', 'D' };

		System.out.println("Innan uppdatering av text till att gå baklänges:");
		System.out.println(text);

		text[0] = 'D';
		text[1] = 'e';
		text[2] = 't';
		text[3] = 't';
		text[4] = 'a';
		text[5] = ' ';
		text[6] = 'v';
		text[7] = 'a';
		text[8] = 'r';
		text[9] = ' ';
		text[10] = 'l';
		text[11] = 'ä';
		text[12] = 't';
		text[13] = 't';
		System.out.println("");
		System.out.println("Efter uppdatering av array!" + "\n");
		System.out.println(text);

	}
}
