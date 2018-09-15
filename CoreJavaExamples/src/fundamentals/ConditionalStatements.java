package fundamentals;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Conditional Statements are also decision making statements in programming.
		 * They are also called as branching statements and also selection statements.
		 * 1) if ( single selection statements or one-way branching):
		 * Syntax 
		 * if(condition)
		 * {
		 * statements 
		 * }
		 * condition is any relational expression depends on the truth value of the conditions.
		 * The statements will be executed.If the conditions will be true, 
		 * the statement will be executed.
		 * 
		 * 
		 * 2) if-else(Double-selection or two-way branching)
		 * Syntax
		 * if (condition)
		 * {
		 *true statments
		 * }
		 * else 
		 * {
		 * false statements
		 * 
		 * }
		 * 3) if-else -if  ladder (Multiple Selection statements)
		 * It is used to check more than one conditions. Among the several conditions 
		 * only one conditions will be true remaining all conditions will be false
		 * Syntax
		 * if(condition)
		 * {
		 * statements
		 * }
		 * else if(condition)
		 * {
		 * ststements
		 * }
		 * else if(condition)
		 * {
		 * statemets
		 * }
		 * .
		 * .
		 * .
		 * else
		 * {
		 * 
		 * statemts
		 * 
		 * 
		 * 
		 * }
		 * 4) switch case (Multiple selection Statements)
		 * 
		 */
		Scanner s=new Scanner(System.in);

		System.out.println("Enter any Integers");
		int i=s.nextInt();
		if(i%2==0)
		{
			System.out.println(i+" is even Number");
		}
		else
		{
			System.out.println(i+" is Odd Number");
		}
		
	
	}

}
