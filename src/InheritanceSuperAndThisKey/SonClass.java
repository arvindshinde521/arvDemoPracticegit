package InheritanceSuperAndThisKey;

public class SonClass extends fatherClass {
	String name = "Arvind";
	
	public SonClass() {
		
		System.out.println(super.name);
	}
	

	public static void main(String[] args) {
		SonClass obj1= new SonClass();
		
		}

}
