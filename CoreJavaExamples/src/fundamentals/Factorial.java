package fundamentals;

public class Factorial {
public static void main(String[] args) {
	
	
	int n=6;
	int result=1;
	int i=1;
	while(i<=n)
	{
		result=result*i;
		i++;
	}
	
System.out.println("The Factorial of  "+n +" is "+result);
}
}
