package fundamentals;

import java.util.Scanner;

public class EvenSum_OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  1 2 3 1 5 6 7
		 *  2 +6
		 *  1+3+1+5+7
		 */

		
		
		
	Scanner  s=new Scanner(System.in);
	
	
	
	
	
	
	
	System.out.println("Enter Size");

	int n=s.nextInt();
	
	int a[]=new int[n];
	int evenSum=0;
	int oddSum=0;
	
	
	System.out.println("Enter The Array Elements");
	
	
	for (int i = 0; i < a.length; i++) {
		a[i]=s.nextInt();
		if(a[i]%2==0)
		{
			evenSum=evenSum+a[i];
		}
		else
		{
			oddSum=oddSum+a[i];
		}
		
	}
	
	
	
	
	System.out.println("the Even sum is: "+evenSum);

	System.out.println("The Odd Sum is "+oddSum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
