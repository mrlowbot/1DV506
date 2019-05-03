package km222nb_lab3;

//Uppift 7.
//Last time i misunderstood but i get it now! 
public class FractioMain {
	public static void main(String[] args) {

		Fraction f1 = new Fraction(5, 23);
		Fraction f2 = new Fraction(-35, 6);


		if (f1.isNegative() == true) {
			System.out.println("Nämnaren/Täljaren är negative.");
			System.exit(0);
		}

		System.out.println("First fraction : " + f1);
		System.out.println("Second fraction : " + f2);

		System.out.println("If you add the fractions then you get : " + f1.add(f2));
		System.out.println("If you multiply the fractions then you get : " + f1.multi(f2));
		System.out.println("If you subtract the fractions then you get : " + f1.sub(f2));
		System.out.println("If you devide the fractions then you get : " + f1.dev(f2));
		if (f1.isEqualTo(f2) == true) {
			System.out.println("The fractions are the same!");
		}

	}
}
