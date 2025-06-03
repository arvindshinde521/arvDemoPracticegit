package customexceptions;

import java.util.Scanner;

public class useCustomException {
	 int age;
	
	public static void validateAge(int age) throws ExceptionClass {
	 
		if(age<18) {
			throw new ExceptionClass ("you are not able to vote");
		}
		else {
			System.out.println("you are able to vote");
		}
	}

	public static void main(String[] args) {
		
		useCustomException obj = new useCustomException();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter you Age : ");

		obj.age = sc.nextInt();
		
		try{
		validateAge(10);
		} catch(ExceptionClass e){
			System.out.println("caught the exception");
		}
	}

}
