package ThreadCreation;

public class Thread1 extends Thread{
	
	/*We don't need to call run method in main method, because it will be executed anyway.
	
	You can call this run method in main method, but it will be executed as normal method,
	it wont be considered as thread.
	
	Min and max priority is 0 to 10 and default will be 5.
	*/
	
	public void run() { //Thread in running state.
		System.out.println("executing a code");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 t1 = new Thread1(); //New state
		
		
		/*
		 * You cannot call start method double, it will give the exception as illegal thread exception. bcoz we cannot 
		 * Give the command to operating system to change the state.
		 */
		
		t1.start(); //Ready state.
		
		//t1.run(); you can call it but it will work as normal method not a thread.
		
		Thread t2 = new Thread();

	}

}
