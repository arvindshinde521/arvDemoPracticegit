package AbstractPac;

public abstract class parent1 {
	/*Abstract class can have abs9lotract method and normal method as well, it means, you can
	 Achieve 0 to 100% abstraction in abstract class.
	 
	 Abstract method doesn't has the body, it is always implemented by the child class.
	 */
	
	public abstract void method1();
	
	public abstract void method2();
	
	//Creating a normal method
	public void normalMethod() {
		System.out.println("My name is normal method");
	}
	


}
