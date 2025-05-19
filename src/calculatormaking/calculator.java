package calculatormaking;
import java.util.Scanner;

public class calculator {
	
	int num1, num2;
	
	int operation;
	
	public void calcu() {
		switch(operation) {
		case 1 : System.out.println("Addition :" +(num1+num2));break;
		case 2 :System.out.println("Subtraction:" + (num1-num2));break;
		case 3 :System.out.println("Multiplications :" +num1*num2);break;
		case 4 :
			if(num2 ==0) {
				System.out.println("The vale cannot be devided by 0");
			}
			else{System.out.println("Division :" + num1/num2);}break;
		default :System.out.println("Enter correct operation (1 To 4)");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calculator cal = new calculator();
		
		System.out.print("Enter the first number : ");
		cal.num1=sc.nextInt();
		
		System.out.print("Enter the Second number : ");
		cal.num2=sc.nextInt();
		
		System.out.print("Select the operation\n 1.addition\n 2.subtraction\n 3.multiplication\n 4.division : " );
		System.out.println("Enter number of operation : ");
		cal.operation = sc.nextInt();		
		cal.calcu();

	}

}
