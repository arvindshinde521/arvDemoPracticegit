package AbstractPac;

public class child1 extends parent1{
	/*If you Inherit the abstract class we need to give the implementation of those 
	  abstract methods in this child class in main method ,
	  or else it will show error line under the child class name or you can declare this 
	  class as abstract class
	  I created one child class here and creating a new child method for this child class
      and add 2nd method there, so this error will disappear.
	 */
	
	
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("I am from method 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 obj = new child1();
		obj.method1();

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}




}
