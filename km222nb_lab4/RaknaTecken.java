package km222nb_lab4;

//Uppgift 2
//Skriver mina ant. på engelska!

import java.io.BufferedReader;//To read!
import java.io.FileReader;//To locate the thing that we want to read!
import java.io.IOException;//Exceptions.

public class RaknaTecken {
	public static void main(String args[]) {
		// Just change the path here.
		String path = "C:\\Users\\karwa\\Desktop\\java\\Led.txt";
		checkRead(path);
		// Also when it comes to the path... i am guessing that we would need to use
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

	private static void checkRead(String path) {
		// Here i only used a try/catch with IOException to tell if there was something
		// wrong in general.
		try {
			FileReader file = new FileReader(path);
			@SuppressWarnings("resource")
			// It does say that the letter "r" is not under use however it is "almost" used
			// but not recognized as such. Guessing that it thinks 1 or 0 and just thinks
			// that it is 0.
			BufferedReader r = new BufferedReader(file);
			int upper = 0, lower = 0, other = 0, whitespace = 0, digits = 0;
			int r1;

			// The rest is self explanatory.

			while ((r1 = r.read()) != -1) {
				char ch = (char) r1;
				if (Character.isUpperCase(ch))
					upper++;
				else if (Character.isLowerCase(ch))
					lower++;
				else if (Character.isWhitespace(ch))
					whitespace++;
				else if (Character.isDigit(ch))
					digits++;
				else
					other++;

				// These if statements save the amount of times something happens and then it
				// simply prints out the results!
			}
			System.out.println("Upper case letters : " + upper);
			System.out.println("Lower case letters : " + lower);
			System.out.println("Digits : " + digits);
			// Did check the English lab as well and added the digits and "others"
			// as separate things.
			System.out.println("Whitespaces : " + whitespace);
			System.out.println("Others : " + other);

		} catch (IOException e) {
			// Note : Could have just written ("Error :" + e) to get the error.
			System.out.println(
					"Error: The file is non-existant or unreadable due to file restrictions\n(java may not be able to read every file with text in it).");
		}
	}
}