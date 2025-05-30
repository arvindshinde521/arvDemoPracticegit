package Exceptionhandeling;

public class excep{
	
	/*When there is some issue with the code that is not executing and has errors, then we 
	 *can bypass that error and execute further code by using exception handling.
	 *there are two types of exceptions
	 *1.Compile time : It shows error when we write the code.
	 *2.Run time: It shows error when we execute the code.
	 */
	public static void main(String[] args) {
		
		System.out.println("I am arvind");
		System.out.println("chinies");
		//int a = 10/0;  //It is not showing the error when we write , so it is run time
		/*Now i am going to use try and catch here
		 */
		
		try{
			int a = 10/0;
		}
		catch(ArithmeticException e){
			System.out.println("I catched exception");
		}
		
		System.out.println("Durva");
	}
}