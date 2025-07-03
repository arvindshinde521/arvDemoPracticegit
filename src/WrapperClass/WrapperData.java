package WrapperClass;

public class WrapperData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;

		Integer a = new Integer(50);   // created object
		
		a= i; // it is auto boxing, here a is object and i is variable
		i= a;//unboxing, here i is variable and turned into i object
		
		/*Auto boxing and unboxing
		 * Converting object to primitive it is called un boxing
		 * When converting primitive data to object it is called as autboxing
		 * 
		 * When you turn your variable into object , you can perform lot of 
		  operation on that.
		*/
		int b = 60;
		
		System.out.println(a.compareTo(b));
		
		
		
	}

}
