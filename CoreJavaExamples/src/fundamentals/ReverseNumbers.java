package fundamentals;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N");
		int n=s.nextInt();
		int rev=0;
		int n1=n;
		
		while(n>0)
		{
			rev=rev*10+(n%10);
			n=n/10;
		}
System.out.println("The Reverse Number of"+n1+" is "+rev);

if(rev==n1)
{
	System.out.println(n1+" is palindrom");
}
else 
{
	System.out.println(n1+" is not palindrom");
}
	}

}
