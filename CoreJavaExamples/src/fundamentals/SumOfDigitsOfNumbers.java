package fundamentals;

import java.util.Scanner;



public class SumOfDigitsOfNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N");
		int n= s.nextInt();
		int n1=n;
		int evensum=0;
		int oddsum=0;
		while(n>0)
		{
			

              int d=n%10;
              if(d%2==0)
              {
            	  evensum= evensum+d;
              }
              else
              {
            	  oddsum = oddsum+d;
              }
			//sum=sum+n%10;
			
			n=n/10;
		}
	

		System.out.println("The Even  Sum of Digits of "+n1 +" is "+evensum);
		System.out.println("The ODD Sum of Digits of "+n1 +" is "+oddsum);
	}

}
