package km222nb_lab4.stack;

//Uppgift 3

import java.util.Iterator;

//We need to implement the interface to make the values from the interface shown here.
public class Stack implements stackInterface {
	public int count = 0; // Keeping where we are in the stack when doing out operations.

	public int size = 2;
	public int[] stack = new int[3]; // Simple fixed array of three places.

	public int size() {
		int size = stack.length; 
		return size;
	}

	// Checking if it is empty.
	// Had to be empty due to it being only zeros.
	// Even if the fixed array had 100 spots with just zeros then it would still be
	// just zeros and therefore empty.
	public boolean isEmpty() {
		int size = 0;
		for (int k : stack) {
			if (k == 0) {
				size++;
				// Iterate through the array.
			}
		}
		if (size == stack.length) {
			return true;
		}
		return false;
	}

	public void push(Object element) {
		// We push in an element in the spot which is on the top.
		stack[count] = (int) element;
		System.out.println("The array has " + element + " at array position " + count + "\n");
		count++; // We keep record of where we are in the stack.
	}

	public Object pop() {
		int data;
		// Whilst trying to use try/catch the program diverted.
		// Explained in the interface about the try/catch and exceptions in general!
		if (isEmpty() == true) {
			System.out.println("Error : The array is empty. Add integers!");
		} else
			count--;
		// We want to go down one step, show that value real quick and then delete that
		// value from the fixed array.
		data = stack[count];
		stack[count] = 0;
		return data;
	}

	// Note : You would most likely never make an object public. But due to the
	// interface it had to become public.
	public Object peek() {

		int keep = 0;
		if (isEmpty() == true) {
			System.out.println("Error : The array is empty.");
		} else if (stack != null) {
			// If the stack is not null then we check the value of the
			// spot that we are at (count).
			keep = stack[count];
		}
		return keep;
	}

	public Iterator<Object> iterator() {
		System.out.print("Iteration = ");
		for (int k : stack) {
			String rev = " ";
			System.out.print(k + rev);
		}
		System.out.println("");
		return null;
	}
}
