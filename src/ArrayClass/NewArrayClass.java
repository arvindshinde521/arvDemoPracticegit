package ArrayClass;

public class NewArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arvindmarks[][]= {{1,2,3}, {1,2,3} , {1,2,3}};
		
		for(int i = 0; i<3; i++) {
			for(int j =0; j<3; j++) {
				
				//Removed ln from println, so it can print to next line
				System.out.print(arvindmarks[i][j]);
			}
			/*Added empty print to move to next line after completing
			a inner loop.*/
			System.out.println();
		}

	}

}
