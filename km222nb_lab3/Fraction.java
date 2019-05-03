package km222nb_lab3;

//Uppgift 7.
public class Fraction {
	private int d;
	private int n;

	public Fraction(int d, int n) {
		this.d = d;
		this.n = n;
	}

	public int getNumerator() {
		return n;
	}

	public int getDenominator() {
		return d;
	}

	public int setNumerator(int num) {
		return this.n = num;
	}

	public int setDenominator(int den) {
		return this.d = den;
	}

	public String toString() {
		return this.getNumerator() + "/" + this.getDenominator();
	}

	public boolean isNegative() {

		if (d <= 0 || n <= 0) {
			return true;
		}
		return false;
	}

	public Fraction add(Fraction in)

	{
		int ResultNum = this.getNumerator() * in.getDenominator() + this.getDenominator() + in.getNumerator();
		int ResultDeno = this.getDenominator() * in.getDenominator();
		return new Fraction(ResultNum, ResultDeno);

	}

	public Fraction dev(Fraction in) {
		int ResultNum = this.getNumerator() * in.getNumerator();
		int ResultDeno = in.getNumerator() * this.getDenominator();
		return new Fraction(ResultNum, ResultDeno);

	}

	public Fraction multi(Fraction in) {
		int ResultNum = this.getDenominator() * in.getDenominator();
		int ResultDeno = this.getNumerator() * in.getDenominator();

		return new Fraction(ResultNum, ResultDeno);
	}

	public Fraction sub(Fraction in) {
		int ResultNum = (this.getNumerator() * in.getDenominator()) - (this.getDenominator() * in.getNumerator());
		int ResultDeno = (this.getDenominator() * in.getDenominator());
		return new Fraction(ResultNum, ResultDeno);
	}

	public boolean isEqualTo(Fraction in) {

		if (this.getNumerator() == in.getNumerator()) {
			if (this.getDenominator() == in.getDenominator()) {
				return true;
			}

		}
		return false;
	}

}
