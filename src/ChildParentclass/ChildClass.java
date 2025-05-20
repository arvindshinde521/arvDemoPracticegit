package ChildParentclass;

public class ChildClass extends ParentClass {
	
	/*here i put the extend word to get the properties from parentclass.
	 * Now created a object of childclass but can access the variables from 
	 * parent
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method 
		ChildClass cc = new ChildClass();
		
		
		cc.num1 = 10;
		cc.num2 =20;
		

	}

}
