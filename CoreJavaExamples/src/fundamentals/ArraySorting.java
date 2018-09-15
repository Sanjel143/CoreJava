package fundamentals;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2 1 3 5 4

		 * a[i] > a[i+1]
		 * 
		 *  1 2 3 4 5
		 */
         int n,temp=0;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the no. of elements");
         n=s.nextInt();
         int a[]=new int[n];
         System.out.println("Enter the array elements");
       
         for (int i=0; i<a.length; i++)
         {
        	 a[i]= s.nextInt();
        	 
         }
         for (int i=1; i<a.length; i++)
         {

             if(a[i-1]>a[i])
             {
            	 temp=a[i];
            	 a[i]=a[i-1];
            	 a[i-1]=temp;
             }
         }
        
    System.out.println("Array after Sort");
    
    
   for (int i = 0; i < a.length; i++) {
	   System.out.println(a[i]);
	
}
	
	}

}
