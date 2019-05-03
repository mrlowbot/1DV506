package km222nb_lab3;

//Uppgift 6.

public class Point {

	private int y; // We want these to ONLY act here, in this class.
	private int x; // That's why we use the constructor to begin with.

	public Point(int i, int j) {
		// Constructor!
		this.x = i;
		this.y = j;
	}

	public String toString() {
		// Creating a stringbuilder.
		StringBuilder S = new StringBuilder();
		S.append(x + "," + y);
		// Saying that the StringBuilder is equal to "yourPointsOut". Making into one
		// string.
		String yourPointsOut = S.toString();
		// And just return it!
		return yourPointsOut;
	}

	public double distanceTo(Point p2) {
		// We are taking note of one point by p2 at the time.
		double ValueXRaised = Math.pow(p2.x - x, 2); // First x.
		double ValueYRaised = Math.pow(p2.y - y, 2); // Then y.
		// The full EQ for the distance formula = Distance = (x2−x1)^2+(y2−y1)^2
		// And then square that to get the final result.
		double Answer = Math.sqrt(ValueXRaised + ValueYRaised);
		return Answer;
	}

	public boolean isEqualTo(Point p2) {
		if (p2.x == x) { // Check for the x value, if it is equal to our first x value.
			if (p2.y == y) { // Same here but for y.
				return true; // Both need to be true in order to get this whole method to return true!
			}

		}
		return false; // Else return false!
	}

	public void move(int i, int j) {
		// Add the numbers to move the point.
		y = y + j;
		x = x + i;

	}

	public void moveToXY(int i, int j) {
		// Moving the point to a specific point that we tell it to be at!
		y = j;
		x = i;
	}

}
