package fundamentals;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * inputs
	 * 1) n size of the array
	 * 2) series of numbers
	 *  3 4 5 6 7
	 * 3) x to fond
	 * 4
	 * output
	 * 4 is found
	 */

		
		int n,key;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Size");
		n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter Array Elements");
		for (int i = 0; i < a.length; i++) {
			
			
			
			a[i]=s.nextInt();
			
			
		}
		
		
		
		System.out.println("Enter The number to be Found");

	
	key=s.nextInt();
	int c=0;
	
	
	for (int i = 0; i < a.length; i++) {
		
		
		
		if(a[i]==key)

		{
			//System.out.println(key+" is Found ");
			c++;
		}
		
		
	
	
	
	
	
	}
	
	if(c>0)
	{
		System.out.println(key+" is Found");
	}
	else
	{
		System.out.println(key+" is Not Found");
	}



}
}