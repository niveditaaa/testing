package cucumber.cucumber;

import java.util.Scanner;

public class PatternsProgram {
	
	   public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	         
	        //Taking rows value from the user
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	     
/*


1234567
  234567
    34567
      4567
        567
          67
            7
          67
        567
      4567
    34567
  234567
1234567


*/
		  int space=5;
		    for (int i = 1; i <= rows; i++) 
	        {
	            //Printing i spaces at the beginning of each row
	             
	            for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	             
	            //Printing i to rows value at the end of each row
	             
	            for (int j = i; j <= rows; j++) 
	            { 
	                System.out.print(j); 
	            } 
			  System.out.println();
		  }
	     
	        
	        //Close the resources
	         
	       sc.close();
	    }

}
