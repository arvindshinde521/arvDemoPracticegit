package ChildParentclass;

public class class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj = new ChildClass();
		
		obj.num1 = 50;
		/*
		 * here you can see i have accessed the variables from parent class
		 * to here in 3rd class by creating object of child class
		 */
		
		System.out.println(obj.num1);
	}

}
