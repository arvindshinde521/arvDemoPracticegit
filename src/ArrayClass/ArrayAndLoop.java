package ArrayClass;

public class ArrayAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*This is multi dimenstion array
		 * 
		 */
		
		int arrayDemo [][] = {{1,2,3} , {4,5,6} , {7,8,9}};
		
		for(int i =0; i<3; i++) //column {
			for(int j =0; j<3; j++) //row {
				System.out.println(arrayDemo [i][j]);
		
		/*here two squere brackets represents the cell location, 
		  like cell location = 1st row, first column.
		 * 
		 */
			}
	
	}


