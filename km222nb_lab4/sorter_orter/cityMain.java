package km222nb_lab4.sorter_orter;

//Uppgift 4. 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator; //Used to compare values. 

//Note that the code is strict. If the name and zip code in the .text/.data file were to be on 
//their opposite sides or if there isn't a semicolon in between then nothing will work as it should...

public class cityMain {
	private static BufferedReader r; // The program thought that the "r" didn't have it's use but when done to
										// private static then it skips that error.
	public static ArrayList<City2> cities = new ArrayList<City2>(); // Made an array for the City2 class.

	public static void main(String[] args) {
		int Z = 0;
		String C = null;
		try {
			// Try/catch for errors.

			FileReader file = new FileReader("C:\\Users\\karwa\\Desktop\\BB.dat");
			r = new BufferedReader(file);
			String currLine;
			// Reads ever line.
			while ((currLine = r.readLine()) != null) {
				if (currLine.trim().length() > 0) {
					String[] split = currLine.split(";"); // We tell it where it should split.
					Z = (Integer.parseInt(split[0])); // We one value of the integers.
					C = (split[1]); // Same with the characters.
					City2 d = new City2(Z, C); // We put them in the other class.
					cities.add(d); // We also add them in the array list for "City2".
				}
			}
			cities.sort(Comparator.comparing(City2::getZipCode)); // Sorts the city list by comparing the City2 list to
																	// getZipCode from the City2 class.
			for (int i = 0; i < cityMain.cities.size(); i++) {
				System.out.println(cityMain.cities.get(i).getZipCode() + " " + cityMain.cities.get(i).getCityName());
				// Takes the city list and counts it all the way out, a k a goes throughout it.
				// Whilst it does that it is printing the location for i at getZipCode and the
				// same for the getCityName.
			}
		} catch (IOException e) {
			// Just said "Error : " + e to make it simple.
			System.out.println("Erorr : " + e);
		}
	}
}