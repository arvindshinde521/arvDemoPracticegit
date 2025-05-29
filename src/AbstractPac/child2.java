package AbstractPac;

public class child2 extends child1{
	
	public void method2() {
		System.out.println("i am from method 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child2 obj2 = new child2();
		obj2.method1();
		obj2.method2();
	}

}
