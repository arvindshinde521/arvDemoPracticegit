package InterFcasePackage;

public class AbsTractClass1 implements DemoInterface1{
	
/*Abstract class can inherit the interface but interface cannot inherit abstract class
 We need to use the implement keyword to inherit interface.
 By the interface you can achieve 100% abstraction without adding abstract keyword before method name.
 When we inherit the interface as parent class, we need to implement all methods from interface
 in the child class or we can declare the child class as abstract.
 
 */
	
	public void method1() {
		System.out.println("i am from method1");
	}

	public void method2() {
		System.out.println("i am from method2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsTractClass1 obj1 = new AbsTractClass1();
		obj1.method1();
		obj1.method2();
	}

}
