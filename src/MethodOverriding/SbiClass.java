package MethodOverriding;

public class SbiClass extends RbiClass{

	public double intrestRate() {
		System.out.println("SBI charges 9%");
		return 9;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*SO we are using one method from parent class that is RBI in other child,
		 * But we can customize its body in child class and print that result.
		 * It is called as method overriding.
		 * 
		 */
		
		RbiClass rbi; // rbi - created reference
		rbi= new SbiClass(); // created object by using new keyword
		rbi.intrestRate(); // now when i call the method it prints method from sbi class specifically.
     
		rbi = new AxisBank();
	    rbi.intrestRate(); //This prints the % from axis bank class
	    
	    rbi= new HDFCbank();
	    rbi.intrestRate(); //This prints the % from HDFC bank class
		
	}

}
