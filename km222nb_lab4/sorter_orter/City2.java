package km222nb_lab4.sorter_orter;

//Hppgift 4.

//We implement the "Comparable" which has its own method called "compareTo".
public class City2 implements Comparable<City2> {

	private int zipCode;
	private String cityName;

	// Constructor and takes the values from the scanning while loop in the
	// mainClass.

	public City2(int zipCode, String cityName) {
		this.zipCode = zipCode;
		this.cityName = cityName;
	}

	// We set the individual values in one method and return it back as well.
	public int getZipCode() {
		return zipCode;
	}

	public String getCityName() {
		return cityName;
	}

	@Override

	// Tried to use this method that comes with the "Comparable"...
	// However even after looking into the oracle doc for a long time
	// i could not find anything that could help me with what i wanted in return.
	// So this method does basically nothing :/
	public int compareTo(City2 o) {
		return this.getZipCode() - o.getZipCode();

	}
}