package fundamentals;

import java.util.Scanner;

public class ArrayExamples {
	
	public static void main(String[] args) {
		
		
		/*
		int x[]= {8,4,5,8,6,8};
		
		for(int i=0;i<6;i++)
		{
		System.out.println(x[i]);
		
		}
		*/
		
		
	

		Scanner s=new Scanner(System.in);
		
		
		
		
		System.out.println("Enter The Size");
		int n=s.nextInt();
		
		
		
		
		int  x[]=new int[n];
		System.out.println("Enter Element");
for(int i=0;i<n;i++)
{
	
	x[i]=s.nextInt();
}

System.out.println("The Array Elemnts Are");

for (int i = 0; i < x.length; i++) {
	
	System.out.println(x[i]);
	
}










	}

}
