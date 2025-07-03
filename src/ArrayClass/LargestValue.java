package ArrayClass;

import org.openqa.selenium.WebDriver;

public class LargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		int large []= {25 , 40 , 50 , 98};
		
		int  max = 0;
		
		for (int i = 1; i<large.length; i++) {
			if(large[i]>max) {
				max = large[i];
			}
			
		}System.out.println(max);
		
		
		/*
		  🔍 Example Walkthrough:
Let’s walk through the array {10, 25, 7, 98, 45}:

max = 25

Compare 40 > 25 → Yes → max = 40

Compare 50 > 40 → yes → max = 40

Compare 50 > 40 → Yes → max = 50

Compare 98 > 50 → yes → max = 98

Final result: 98 is the largest.
		 */
		
		
		
			

	}

}
