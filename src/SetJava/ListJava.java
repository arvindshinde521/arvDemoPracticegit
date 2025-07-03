package SetJava;

import java.util.ArrayList;
import java.util.List;

public class ListJava {
	
	/*List is collection and it allows duplicate value.
	 * We can access the element by index.
	 * Example of List = ArrayList, LinkedList
	 */

	public static void main(String[] args) {
		
		List<String> listExample = new ArrayList<>();
		listExample.add("A");
		listExample.add("B");
		listExample.add("A");  // Allowed

		System.out.println(listExample);  // Output: [A, B, A]
		System.out.println(listExample.get(1));  // Output: B


	}

}
