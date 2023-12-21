import java.util.Scanner;

public class ForLoop {
	
	public static void main(String[] args) {
		
		int i,no, fact = 1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any number = ");
		no = s.nextInt();
		
		for(i = 1; i<=no; i++)
		{
			fact = fact*i;
			//fact*=i;
		}
		
		System.out.println("Factorial of "+no+" is "+fact);
		
	}
}



/*
 * i = 6
 *  no = 5 
 * fact = 120
 */



/*
 * syntax:
 * 
 * for(init; condition; inc/dec) 
 * { stmts; } .....
 */