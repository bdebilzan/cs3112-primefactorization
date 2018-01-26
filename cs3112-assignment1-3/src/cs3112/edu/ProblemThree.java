package cs3112.edu;

import java.util.Scanner;

//For any given integer n > 1, outputs its prime factorization.
//E.g. n=8, output:2^3; n=72, output: 2^3*3^2.
										
public class ProblemThree {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer greater than one:");
		int n = Integer.parseInt(scan.nextLine());
		
		System.out.println("Prime factorization:");
		
		int count;
		int count2 = 0;
			
		for (int i = 2; i <= n; i++) 
		{
            		count = 0;
            
           		 //if number entered divides any number then set number entered equal to number entered divided by i 
           		 while (n % i == 0) 
           		 {
               			 n /= i;
               			 count++;
            		}
                	if (count == 0) 
               		 {
                		continue;
               		 }
                
                	//count2++ for * symbol
               		 count2++;
                
                	if (count2 > 1)
                	{
                		System.out.print("*" + i + "^" + count);
               		}
                
               		 else
              		{
                		System.out.print(i + "^" + count);
                	}   
            	}
        }
}

