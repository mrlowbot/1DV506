package km222nb_lab3;

//Uppgift 3

public class MultiDisplay {

	private int Count = 0;
	private String Massage = "";

	public void setDisplayMessage(String string) {
		Massage = string;
	}

	public void setDisplayCount(int n) {
		Count = n;
	}

	public void display() {
		// Due ti tge fact that we wanted it to print 3 times i made an if statement for
		// only when we ask it do as such when we put our count to 3.
		// Note that we could have just made it so that we can print this how many times
		// that we want.
		// By deleting the if statement and saying that the number "3" in the forloop is
		// equal to "Count".
		// Just saying...
		if (Count == 3)
			for (int i = 0; i < 3; i++)
				System.out.println(Massage);
	}

	public void display(String string, int n) {
		Massage = string;
		if (n == 2)
			for (int j = 0; j < 2; j++)
				System.out.println(string);

	}

	// Tried to use a consctuctor on these once but it ended up not working so had
	// to go this way. And seeing that i cannot add a conscturoe without making the
	// code more
	// complex then of what it really has to be.
	public String getDisplayMessage() {
		return Massage;
	}

	public int getDisplayCount() {
		return Count;
	}

}