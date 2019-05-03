package km222nb_lab3;

//Uppgift 1

//Forbidden to use array classes. 
public class Array {
	static final int[] arr = { 6, 3, 5, 4, 7 };

	// Made this a static and a final so that it won't change and so that everything
	// can access it!
	public static int valueKeep = 0;

	public static void main(String[] args) {

		System.out.print("The sum of all numbers in the array are : ");
		System.out.print(sum(arr)); // For sum method. It takes all the values of arr and adds them together.
		System.out.println("\n");
		System.out.print("The numbers in the array are : ");
		System.out.print(tostring(arr)); // Prints out the numbers from the array.
		System.out.print("\n\n");


		System.out.print("The new numbers, after being added together with a new number, are : ");
		addN(arr, 10);
		System.out.println("\n\n");
		System.out.print("Reverse order of array : ");
		reverse(arr);
		System.out.println("\n");
		hasN(arr, 4);
		System.out.print("\n\n");
		System.out.print("Value switch : ");
		replaceAll(arr, 0, 41);

		System.out.print("\n\n");
		System.out.print("And the numbers in order are : ");
		sort(arr);
	}

	private static int sum(int[] arr) {

		int n = 0;
		for (int i : arr) {
			n += i;
		}
		return n;
	}

	private static String tostring(int[] arr) {
		String strk = " ";
		int i = 0;
		String st = null;

		for (i = 0; i < arr.length; i++) {
			st = Integer.toString(arr[i]);
			System.out.print(st + strk);
			if (i >= arr.length) {
				break;
			}
		}

		return strk;
	}

	private static int[] addN(int[] arr, int n) {

		String strK = " ";
		int results[] = null;
		int k = 0;
		for (k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + n + strK);
		}
		return results;
	}

	private static int[] reverse(int[] arr) {

		int counter = 0;
		String str = " ";
		for (counter = arr.length - 1; counter >= 0; counter--) {
			System.out.print(arr[counter] + str);

		}
		return arr;

	}

	private static boolean hasN(int[] arr, int n) {

		boolean found = false;
		for (int i = 0; !found && (i < arr.length); i++) {

			found = (arr[i] == n);
		}

		if (found == true) {
			System.out.println("Yes, " + n + " does exist in the array!");

		} else {
			System.out.println("No, " + n + " does not exist in the array!");

		}
		return found;

	}

	private static void replaceAll(int[] arr, int old, int nw) {

		String str = " ";
		arr[old] = nw;
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + str);
		}

		System.out.println("");
		System.out.println("In position " + old + " you chose to change it in to the value " + nw + "!");
		System.out.println();
		arr[0] = 6;

	}

	private static int[] sort(int[] arr) {
		int toSwap, indexOfSmallest = 0;
		int i, j, smallest;
		String str = " ";

		for (i = 0; i < arr.length; i++) {

			smallest = Integer.MAX_VALUE;

			for (j = i; j < arr.length; j++) {
				if (arr[j] < smallest) {
					smallest = arr[j];
					indexOfSmallest = j;
				}
			}

			toSwap = arr[i];
			arr[i] = smallest;
			arr[indexOfSmallest] = toSwap;
			System.out.print(arr[i] + str);
		}

		return arr;
	}
}
