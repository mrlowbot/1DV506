package km222nb_lab4.stack;

//Uppgift 3

import java.util.Iterator;

public interface stackInterface {
	// Just the interface.
	int size();

	boolean isEmpty();

	void push(Object element);

	Object pop();

	Object peek();

	Iterator<Object> iterator();

	// Due to the fact that when a try/catch is within the pop or peek the program
	// wants to use a "throw" instead because of the return value.
	// Did not want to use any throw exception due to the fact that it would add
	// onto the interface and i rather not change these in anyway.

	// Instead i used if statements.

}
