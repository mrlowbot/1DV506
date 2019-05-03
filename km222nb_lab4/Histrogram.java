package km222nb_lab4;

//Uppgift 1
//Skriver mina ant. på engelska!

import java.io.BufferedReader;//To read.
import java.io.FileReader;//Locate the file.
import java.io.IOException;
import java.util.ArrayList;//ArrayList...

//Note : Whole integers for every line. Example: 542 and the next being 43 etc.
//White spaces after each whole integer, or before, is fine and will be trimmed out! 
//Also... i would've made more classes to make it easier to read the code however it wasn't needed in the assignment.
//But i am only saying that due to the "static void histogram" that is, at least i think, overkill and should've been done in a cleaner matter.

public class Histrogram {
	public static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {

		String call = "C:\\Users\\karwa\\Desktop\\java\\X(2).txt";
		eX(call);
		// Same thing goes for this "path" when trying to use the txt/dat file.
		// Because i am guessing that we would need to use
		// a scanner just because if we make this into an .EXE file then it would only
		// go to the "path" name that we gave it. However for this i guess that we
		// won't have to be too specific. And making a scanner for that string won't be
		// difficult. Could also make it easier by making it so that the user gets to
		// write
		// their name of their computer name. Mine was "karwa". And then also ask them
		// to put
		// the txt/dat file on the desktop and let the program string everything
		// together.

	}

	static void eX(String path) {
		int countStartRest = 0; // If there is an exception then we need to not execute any of our other
								// methods. Keeping a counter for such.
		try {
			read(path); // Trying this path by the "read" method.
		}
		// NOTE : A simple try/catch in the "read(String calling)" would have been
		// enough instead of using another method, in this case eX, to test for
		// exceptions!

		catch (Exception e) {
			countStartRest++; // If we get an exception then we act on it.
			// Too long of an error message but wanted to have some fun so wrote as much as
			// i could to be as specific as i could on this error line!
			// Will not do such errors in the future if it isn't said that i should do so.
			System.out.println(
					"File not found, unreadable (due to string in code), a mix of string\nand integers together or even just integers apart from eachother!\nPlease make sure of that it only exist one whole integer \nfor each line so '43' and then next line etc...");
		}
		// If no exception is acting out!
		if (countStartRest == 0) {
			count();
			histogram();
		}
	}

	static void read(String calling) throws IOException {

		// Reading from our path.
		FileReader file = new FileReader(calling);
		BufferedReader read = new BufferedReader(file);
		System.out.println("Reads from : " + calling);
		int data1 = 0;
		String line = " ";
		// Reading every line.
		while ((line = read.readLine()) != null) {
			// Trimming the line from any white spaces and making it into an integer value
			// (which it already is).
			data1 = Integer.valueOf(line.trim());
			list.add(data1);
		}
		read.close();

	}

	static void count() {
		// This counts some occurrences of whole integers between 0 and 100.
		int c = 0;
		int wholeSum = 0;
		for (int k : list) {
			if (k > 0 && k < 101) {
				c++;
			}
			wholeSum++;
		}

		System.out.println("Between the interval of [0, 100] there are : " + c + " values. ");
		System.out.println("And a rest of : " + (wholeSum - c) + " values.");
	}

	static void histogram() {
		// This is not an effective way of writing everything out!
		// Tried using a for loop to update all the values and using multiple parameters
		// for such. But it ended up not working so made it in this way.

		// Each for loop checks for specific whole integers between, example: 0 and 11
		// but
		// really looks for things greater then 0 and less than 11.
		System.out.println("Histogram :");
		System.out.print(" 1  - 10  | ");
		for (int k : list) {
			if (k > 0 && k < 11) {
				System.out.print("* ");
			}

		}
		System.out.println("");

		System.out.print(" 11 - 20  | ");
		for (int k : list) {
			if (k > 10 && k < 21) {
				System.out.print("* ");
			}

		}
		System.out.println("");

		System.out.print(" 21 - 30  | ");
		for (int k : list) {
			if (k > 20 && k < 31) {
				System.out.print("* ");
			}

		}
		System.out.println("");

		System.out.print(" 31 - 40  | ");
		for (int k : list) {
			if (k > 30 && k < 41) {
				System.out.print("* ");
			}

		}
		System.out.println("");

		System.out.print(" 41 - 50  | ");
		for (int k : list) {
			if (k > 40 && k < 51) {
				System.out.print("* ");
			}

		}
		System.out.println("");

		System.out.print(" 51 - 60  | ");
		for (int k : list) {
			if (k > 50 && k < 61) {
				System.out.print("* ");
			}

		}
		System.out.println("");

		System.out.print(" 61 - 70  | ");
		for (int k : list) {
			if (k > 60 && k < 71) {
				System.out.print("* ");
			}

		}
		System.out.println("");

		System.out.print(" 71 - 80  | ");
		for (int k : list) {
			if (k > 70 && k < 81) {
				System.out.print("* ");
			}

		}
		System.out.println("");

		System.out.print(" 81 - 90  | ");
		for (int k : list) {
			if (k > 80 && k < 91) {
				System.out.print("* ");
			}

		}
		System.out.println("");

		System.out.print(" 91 - 100 | ");
		for (int k : list) {
			if (k > 90 && k < 101) {
				System.out.print("* ");
			}

		}
		System.out.println("");
	}

}
