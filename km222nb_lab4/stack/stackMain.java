package km222nb_lab4.stack;

//Uppgift 3

import java.util.Arrays;

//Uppgift 3.

import java.util.Scanner;//Scanner...

public class stackMain {

	public static void main(String[] args) {
		boolean run = true;
		String q = "Q";
		System.out.print("This program will keep growing with its size.\nTo stop just press 'Q'.\n");
		Stack s = new Stack();
		Scanner in = new Scanner(System.in);

		while (run == true) {
			while (true) {
				if (in.equals(q)) {
					System.out.println("You have now exited the program\n\n");
					break;
				} else {

					s.stack = Arrays.copyOf(s.stack, s.stack.length + s.size);
					// These are self explanatory...
					Object element = 0;
					System.out.println("The array size is : " + s.size());
					System.out.print("Write the next int : ");
					element = in.nextInt();
					System.out.println("The array is empty? : " + s.isEmpty() + "\n");
					s.push(element);
					System.out.print("Please add a number that you would like to add to the array : ");
					element = in.nextInt();
					s.push(element);
					System.out.print("Please add a number that you would like to add to the array : ");
					element = in.nextInt();
					s.push(element);

					// In s.pop we are saying the spot of the array's value. We could very well do
					// it as we see it. Meaning if we change the value at the current spot which is
					// 2 in the array then we will actually change the spot 3 when we look at it.
					// A k a it thinks from 0, 1, 2 etc but we think 1, 2, 3 etc...
					System.out.println("\nThe value was " + s.pop() + " at array position " + s.count + "\n");
					s.iterator();
				}
			}
			in.close();
		}
	}
}
