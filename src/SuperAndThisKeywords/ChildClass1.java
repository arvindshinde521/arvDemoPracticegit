package SuperAndThisKeywords;

public class ChildClass1 extends ParentClass1 {
	
	int num1 = 10;
	/*The parent and child has the same variable as num1 so when i want to print
	 * Specific value from parent i can use super keyword.
	 */
	public ChildClass1() {
		//Always create a constructor and call variable from parent.
		System.out.println("value of num1 from Child :" + num1 ); //It called value from this child class.

		System.out.println("Value of num1 from parent :"+ super.num1);
		//To print value of num1 from child we can use this keyword
		System.out.println("value fo num1 from child by using this keyword :"+ this.num1);
		
	}
	

	public static void main(String[] args) {

		ChildClass1 obj1 = new ChildClass1();
		/*here without calling a method when you run the code it prints the results because
		 * They both methods are constructor and they runs anyway.
		 * 
		 */
		
	}

}
