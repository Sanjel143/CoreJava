package fundamentals;

import java.util.Scanner;

public class MaximumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
   System.out.println("Enter two integers");
   int a=s.nextInt();
   int b=s.nextInt();
   if (a>b)
   {
	   System.out.println(a+" is Greater Value");
   }
   else
   {
	   System.out.println(b+" is Greater Value");
   }
	}

}
