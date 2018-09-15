package fundamentals;

import java.util.Scanner;

public class AbsoluteNumberExamples {
	public static void main(String[] args)
	{
		/* 
		 * 7   abs  is 7
		 * -7 abs   is 7
		 * 
		 * -10 -(-10) 10
		 *-2 -1  0 1 2 3
		 * 
		 */
		
		
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int number=s.nextInt();
		if(number<0)
		{
			number = -(number);
		}
		
		System.out.println("The Absolute Number is"+number);
		
	}

}
