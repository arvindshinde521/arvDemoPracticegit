package SetJava;

import java.util.HashSet;
import java.util.Set;

public class UseOfSet {
	
	/*Set is a collection that cannot have duplicate values.
	 * It does not maintain the order.
	 * Example of Set: HashSet, LinkedHashSet, TreeSet
	 */

	public static void main(String[] args) {

		Set<String> setExample = new HashSet<>();
		
		setExample.add("A");
		setExample.add("R");
		setExample.add("V");
		setExample.add("I");
		setExample.add("D");
		setExample.add("A"); //it will ignore duplicate value

		System.out.print(setExample);


	}

}
