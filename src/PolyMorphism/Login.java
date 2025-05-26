package PolyMorphism;
/*
 * Polymorphism is achieved by method overriding.
 * We can write same method multiple times by changing
 * 1.Its parameter
 * 2.Sequence of parameter.
 * type of parameter.
 * Now below i am going to create the constructor with diff parameters.
 */

public class Login {
	
	public Login(String name, String address) {
		System.out.println("my name is :"+ name + " "+ "And address is :"+ address);
	}
	public Login(int rollNo, int studid) {
		System.out.println("my rollNo is :"+ " " + rollNo + " And studid is :"+ studid);

	}

	public static void main(String[] args) {
		Login obj = new Login("Arvind","nanded");
		Login obj2 = new Login(10,20);
	}

}
