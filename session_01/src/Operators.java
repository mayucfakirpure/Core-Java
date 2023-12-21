import java.util.Scanner;

public class Operators {
	
	public static void main(String[] args) {
		
		int a,b,sum=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any two numbers = ");
		a = s.nextInt();
		b = s.nextInt();
		
		sum = a+b;
		System.out.println(a+" + "+b+" = "+sum);
		
		int max  = (a>b)?a:b;
		System.out.println("Maximum of "+a+" and "+b+" is "+max);
		
	}

}

/*
 * Ternary Operator: ?:
 * Conditional Operator
 */

