package fundamentals;

import java.util.Scanner;

public class MaximumOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("Enter 3 Numbers");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();

if(a>b && a>c)
{
	System.out.println(a+" is Greater Value");
}
else if(b>a && b>c)
{
	System.out.println(b+" is Greater Value");
}
else
{
	System.out.println(c+" is Greater Number");
}
	}

}
