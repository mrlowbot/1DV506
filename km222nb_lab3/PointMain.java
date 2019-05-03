package km222nb_lab3;

//Uppgift 6.

public class PointMain {

	public static void main(String[] main) {

		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);

		System.out.println(p1.toString()); // ==> (0,0)
		System.out.println(p2.toString()); // ==> (3,4)

		if (p1.isEqualTo(p2)) // False!
			System.out.println("The two points are equal");

		double dist = p1.distanceTo(p2);
		System.out.println("Point Distance: " + dist);

		p2.move(5, -2); // ==> (8,2)
		p1.moveToXY(8, 2); // ==> (8,2)

		if (p1.isEqualTo(p2)) // True!
			System.out.println("The two points are equal");

	}
}
